import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mizuki
 */
public class QrCodeMain {

    public static void main(String[] args) throws IOException, NotFoundException, ChecksumException, FormatException {

        //読み取りたい画像ファイルの保存場所
        String filePath = "/javaTest/loveLive.png";

        //読み取り処理
        BufferedImage image = ImageIO.read(new File(filePath));
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Reader reader = new MultiFormatReader();
        Result decodeResult = reader.decode(bitmap);

        //デコード処理
        String result = decodeResult.getText();
        //標準出力
        System.out.format("読み取り結果=%1$s", result);
    }
}
