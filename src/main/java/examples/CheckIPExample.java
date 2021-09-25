package examples;

import com.harium.api.checkip.CheckIPAPI;

import java.io.IOException;

public class CheckIPExample {

    public static void main(String[] args) throws IOException {
        System.out.println(CheckIPAPI.getIp());
    }

}
