package file.LaunchLogger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM");
        Instant instant = Instant.now();
        MonthDay monthDay = MonthDay.now();
        System.out.print(fmt.format(instant));

        Path directory = Path.of(System.getProperty("user.home"), "launches");
        Path newFile = directory.resolve(fmt2.format(monthDay));

        try {
            Files.createDirectories(directory);
            Files.writeString(newFile,
                    fmt.format(instant) + "\n",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
                    );


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
