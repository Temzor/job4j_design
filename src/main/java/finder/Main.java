package finder;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            throw new IllegalArgumentException("Wrong amount of args, see example : -d=C:\\projects\\job4j_design -e=.txt -o=project.zip");
        }
        ArgsName argsName = ArgsName.of(args);
        Search search = new Search();
        Path source = Paths.get(argsName.get("d"));
        String include = argsName.get("n");
        Path packName = Paths.get(argsName.get("o"));

        List<Path> filterList = search.search(source, p -> p.toFile().getName().endsWith(include));
        for (Path path : filterList) {
            System.out.println(path);
        }

    }
}


