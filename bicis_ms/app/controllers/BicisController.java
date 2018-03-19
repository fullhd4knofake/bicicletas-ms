package controllers;

import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class BicisController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */


    public Result index() {
        List<Bicicleta> bicicletas = Bicicleta.find.all();
        return ok( Json.toJson(bicicletas) );
    }


    public Result create() {
        Bicicleta bicicleta = new Bicicleta();
        getRequests(bicicleta).save();
        return ok(Json.toJson(bicicleta));
    }

    public Result show(Integer serial){
    	Bicicleta bicicleta = Bicicleta.find.byId(serial);
        return ok( Json.toJson(bicicleta) );
    }

	public Result update(Integer serial){
    	Bicicleta bicicleta = Bicicleta.find.byId(serial);
        getRequests(bicicleta).save();
        return ok();
    }

	public Result destroy(Integer serial){
        Bicicleta.find.deleteById(serial);
        return ok();
    }


    private Bicicleta getRequests(Bicicleta bicicleta) {
        JsonNode json = request().body().asJson();

        bicicleta.serial = json.findValue("serial").bigIntegerValue();
        bicicleta.marca = json.findValue("marca").textValue();
        bicicleta.color =  json.findValue("color").textValue();

        return bicicleta;
    }
}
