package za.ac.nwu.web.sb.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.domain.service.GeneralResponse;


@RestController
public class AccountTypeController {

    @GetMapping("/ping")
    @ApiOperation(value = "Echo the Ping.", notes = "This echo the ping back to the client")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})

    public ResponseEntity<String> ping(@RequestParam(value = "value that will be echoed", defaultValue = "pong")
                                               String echo) {
        return new ResponseEntity<>(echo, HttpStatus.OK);

        @GetMapping("/all")
        @ApiOperation(value = "gets all configured account types", notes = "returns a list of all account types")
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
                @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
                @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
                @ApiResponse(code = 500, message = "Internal Service Error", response = GeneralResponse.class)
        })

        //public GeneralResponse<String> getall(){return  new GeneralResponse<String>(getall().isSuccesful(), getall().getPayload());};
        public ResponseEntity<GeneralResponse<String>> getall () {
            GeneralResponse<String> response = new GeneralResponse<String>(true, true);
        }
        return new ResponseEntity<>(Response HttpStatus; OK);
    }
}


