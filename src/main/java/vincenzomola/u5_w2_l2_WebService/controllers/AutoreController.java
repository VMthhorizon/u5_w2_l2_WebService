package vincenzomola.u5_w2_l2_WebService.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vincenzomola.u5_w2_l2_WebService.entities.Autore;
import vincenzomola.u5_w2_l2_WebService.payloads.AutoreRequestPayload;
import vincenzomola.u5_w2_l2_WebService.payloads.AutoreResponsePayload;
import vincenzomola.u5_w2_l2_WebService.services.AutoreServices;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    private final AutoreServices autoreServices;

    public AutoreController(AutoreServices autoreServices) {
        this.autoreServices = autoreServices;
    }

    @GetMapping
    public List<Autore> findAll() {
        return autoreServices.getAllAutori();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.FOUND)
    public AutoreResponsePayload createAutore(@RequestBody AutoreRequestPayload body) {
        return this.autoreServices.createAutore(body);
    }

    @GetMapping("/{autoreId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Autore findById(@PathVariable long autoreId) {
        return autoreServices.findById(autoreId);
    }

    @PutMapping("/{autoreId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public AutoreResponsePayload UpdateById(@RequestBody AutoreRequestPayload body, @PathVariable long autoreId) {
        return this.autoreServices.findAndUpdate(body, autoreId);
    }

    @DeleteMapping("/{autoreId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAutore(@PathVariable long autoreId) {
        this.autoreServices.delete(autoreId);
    }

}
