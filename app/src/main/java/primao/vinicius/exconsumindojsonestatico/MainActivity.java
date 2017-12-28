package primao.vinicius.exconsumindojsonestatico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //JSON ESTATICO CLIENTE
        String jsonCliente = "{cliente:{\"id\":\"1\",\"nome\":\"Vinícius Primão\",\"RG\":\"1234567891\",\"email\":\"thiagocury@gmail.com\"}}";

        try {
            Cliente c = new Cliente();
            JSONObject json = new JSONObject(jsonCliente);
            JSONObject cliObj = json.getJSONObject("cliente");

            c.setId(cliObj.getInt("id"));
            c.setNome(cliObj.getString("nome"));
            c.setRG(cliObj.getString("RG"));
            c.setEmail(cliObj.getString("email"));

            Toast.makeText(getBaseContext(),
                    "Json:" + c.toString(),
                    Toast.LENGTH_LONG).show();
        } catch (JSONException js) {
            Toast.makeText(getBaseContext(),
                    "erro" + js.getMessage(),
                    Toast.LENGTH_LONG).show();
        }


    }
}
