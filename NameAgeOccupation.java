<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>ReadUsers</artifactId>
    <version>1.0-SNAPSHOT</version>

    <packaging>jar</packaging>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>

        <dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.12.1</version>
        </dependency>
    </dependencies>

</project>

/////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadUsersEx {

    public static void main(String[] args) throws IOException {

        var url = "http://test.webcode.me/users.txt";

        var doc = Jsoup.connect(url).get();

        var content = doc.body().text();

        String[] parts = content.split(";");

        List<User> users = new ArrayList<>();

        for (String part : parts) {

            String[] parts2 = part.trim().split(",\\s");
            var user = new User(parts2[0], parts2[1], Integer.parseInt(parts2[2]));
            users.add(user);
        }

     users.forEach(System.out::println);
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

public class User {

    private String name;
    private String occupation;
    private int age;

    public User(String name, String occupation, int age) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }


}


