import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Itemlist  implements Handler {
    private ArrayList<Clothing> prendas;

    public Itemlist(ArrayList<Clothing> prendas) {
        this.prendas = prendas;
    }

    public ArrayList<Clothing> getItems() {
        return prendas;
    }

    public void setItems(ArrayList<Clothing> prendas) {
        this.prendas = prendas;
    }

    @Override
    public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.status(Http.Status.OK_200);
        serverResponse.headers().put("Content Type","text/plain: charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for (Clothing i: prendas){
            result.append(i+"/n");


        }
        serverResponse.send(result);
    }



}
