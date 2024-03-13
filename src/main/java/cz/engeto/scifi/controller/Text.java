package cz.engeto.scifi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

@RestController
public class Text {
    @GetMapping("romantic")
    public StringBuilder loadFromFileRomantic(String fileName) throws TextException{
        fileName = Settings.getRomantic();
        StringBuilder romantic = new StringBuilder();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                for(String part : parts) {
                    romantic.append(part).append(" ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading: " + e.getLocalizedMessage());
        }
        return romantic;
    }

    @GetMapping("historic")
    public StringBuilder loadFromFileHistoric(String fileName) throws TextException{
        fileName = Settings.getHistoric();
        StringBuilder historic = new StringBuilder();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                for(String part : parts) {
                    historic.append(part).append(" ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading: " + e.getLocalizedMessage());
        }
        return historic;
    }

    @GetMapping("scifi")
    public StringBuilder loadFromFileScifi(String fileName) throws TextException{
        fileName = Settings.getScifi();
        StringBuilder scifi = new StringBuilder();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                for(String part : parts) {
                    scifi.append(part).append(" ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading: " + e.getLocalizedMessage());
        }
        return scifi;
    }



}
