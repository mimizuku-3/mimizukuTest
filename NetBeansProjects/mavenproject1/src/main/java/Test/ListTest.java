/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.FqrItemResult;

/**
 *
 * @author mizuki
 */
public class ListTest {

    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // model作成
        //qrcode, createDateTime, updateDateTime, startDateTime
        FqrItemResult fi1 = new FqrItemResult("1000001", LocalDateTime.parse("2018/04/01 23:30:59", f), LocalDateTime.parse("2018/04/01 23:30:59", f), LocalDateTime.parse("2018/04/01 23:30:59", f));
        FqrItemResult fi2 = new FqrItemResult("1000002", LocalDateTime.parse("2018/04/15 23:30:59", f), LocalDateTime.parse("2018/04/15 23:30:59", f), LocalDateTime.parse("2018/05/01 23:30:59", f));
        FqrItemResult fi3 = new FqrItemResult("1000003", LocalDateTime.parse("2018/05/05 23:30:59", f), LocalDateTime.parse("2018/05/05 23:30:59", f), LocalDateTime.parse("2018/06/01 23:30:59", f));
        List<FqrItemResult> fqrItemResultList = new ArrayList<>();
        fqrItemResultList.add(fi3);
        fqrItemResultList.add(fi2);
        fqrItemResultList.add(fi1);
        fqrItemResultList.stream().forEach(fqrItem -> System.out.println(fqrItem.getQrCode()));

        // 各リストソート
        List<LocalDateTime> createDateTimeList = fqrItemResultList.stream().map(fqrItem -> fqrItem.getCreateDatetime()).collect(Collectors.toList());
        System.out.println("createDateTime -sort順");
        createDateTimeList.stream().sorted().forEach(System.out::println);
        List<LocalDateTime> updateDateTimeList = fqrItemResultList.stream().map(fqrItem -> fqrItem.getUpdateDatetime()).collect(Collectors.toList());
        System.out.println("updateDateTime -sort順");
        updateDateTimeList.stream().sorted().forEach(System.out::println);
        List<LocalDateTime> startDateTimeList = fqrItemResultList.stream().map(fqrItem -> fqrItem.getStartDatetime()).collect(Collectors.toList());
        System.out.println("startDateTime -sort順");
        startDateTimeList.stream().sorted().forEach(System.out::println);

        // 最大値, 最小値取得
        LocalDateTime minCreateDateTime = fqrItemResultList.stream().map(fqrItem -> fqrItem.getCreateDatetime()).collect(Collectors.toList()).stream().min(Comparator.naturalOrder()).get();
        System.out.println("最小作成日: " + minCreateDateTime);
        LocalDateTime maxUpdateDateTime = updateDateTimeList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("最小更新日: " + maxUpdateDateTime);
        LocalDateTime minStartDateTime = startDateTimeList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("最小開始日: " + minStartDateTime);
    }
}
