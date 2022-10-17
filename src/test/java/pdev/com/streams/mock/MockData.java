package pdev.com.streams.mock;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import pdev.com.streams.bean.Estado;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Component
public class MockData {

    public static List<Estado> getEstados() throws IOException {
        InputStream inputStream = Resources.getResource("estados.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Estado>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }
}
