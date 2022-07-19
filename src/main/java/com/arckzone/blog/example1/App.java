package com.arckzone.blog.example1;

import com.arckzone.blog.example1.model.Career;
import com.arckzone.blog.example1.model.Gender;
import com.arckzone.blog.example1.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static final List<User> users = new ArrayList<>() {{
        add(
                new User(
                        Gender.Female,
                        new Career(
                                "Software Engineer",
                                true,
                                "Development Team"
                        ),
                        "Lisa",
                        "Watson",
                        "lisa.watson@demo.email.com",
                        "2125557799",
                        "4034 Freedom Lane",
                        25
                )
        );
        add(
                new User(
                        Gender.Male,
                        new Career(
                                "Driver",
                                false,
                                "Transportation"
                        ),
                        "Adam",
                        "Smith",
                        "adam.smith@demo.email.com",
                        "2123332211",
                        "4034 Freedom Lane",
                        34
                )
        );
        add(
                new User(
                        Gender.Female,
                        new Career(
                                "Doctor",
                                true,
                                "Infirmary"
                        ),
                        "Olivia",
                        "Johnson",
                        "olivia.johnson@demo.email.com",
                        "2125545511",
                        "880 Sigley Road",
                        33
                )
        );
        add(
                new User(
                        Gender.Male,
                        new Career(
                                "Civil Engineer",
                                false,
                                "Central Team"
                        ),
                        "John",
                        "Terry",
                        "john.terry@demo.email.com",
                        "2127775522",
                        "790 Freed Drive",
                        40
                )
        );
        add(
                new User(
                        Gender.Female,
                        new Career(
                                "Doctor",
                                true,
                                "Infirmary"
                        ),
                        "Emma",
                        "Stone",
                        "emma.stone@demo.email.com",
                        "2127775522",
                        "790 Freed Drive",
                        37
                )
        );
        add(
                new User(
                        Gender.Male,
                        new Career(
                                "CEO",
                                true,
                                "Main Office"
                        ),
                        "Edward",
                        "Williams",
                        "edward.williams@demo.email.com",
                        "21211119922",
                        "2529 Horizon Circle",
                        43
                )
        );
    }};

    public static void main(String[] args) {
        printFilteredData();
    }

    private static void printFilteredData() {
        var result = users
                .stream()
                .map(user -> user.getCareer())
                .filter(career -> career.isFulltime())
                .map(Career::getTitle)
                .map(String::toUpperCase)
                .distinct()
                .limit(2)
                .collect(Collectors.toList());

        for (final var title : result) {
            System.out.println(title);
        }
    }
}
