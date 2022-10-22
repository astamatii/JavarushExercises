package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class L6_8_Files_MethodsVsStreamAPI {
	public static void main(String[] args) throws IOException {

		//Creating the file
		Path stih = Paths.get("D:\\stih_" + LocalDate.now() + ".txt");
		Files.createFile(stih);

		OutputStream output = Files.newOutputStream(stih);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output), 100);
		String poem = "Я помню чудное мгновенье:\r\n" + "Передо мной явилась ты,\r\n" + "Как мимолетное виденье,\r\n"
				+ "Как гений чистой красоты.";
		writer.write(poem);
		writer.close();

		//Read lines and printing using forEach loop:
		List<String> lines = Files.readAllLines(stih, UTF_8);
		List<String> result = new ArrayList<>();
		for (String s : lines) {
			if (s.startsWith("Как")) {
				String upper = s.toUpperCase();
				result.add(upper);
			}
		}
		for (String s : result) {
			System.out.println(s);
		}

		//Read lines and printing them using Stream:
		Stream<String> stream = Files.lines(stih);
		List<String> result_stream = stream
				.filter(line -> line.startsWith("Как"))	//Отбираем нужные строки
				.map(String::toUpperCase) 				//Проходимся по всем отобранным строкам
				.collect(Collectors.toList());			//Объединяем все получившиеся строки в List
		result_stream.forEach(System.out::println);

		Files.delete(stih);
	}
}
