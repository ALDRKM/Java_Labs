package org.example;
import java.time.LocalDateTime;

public interface Maintainable {
    void maintain();
    LocalDateTime getServiceDate();

}
