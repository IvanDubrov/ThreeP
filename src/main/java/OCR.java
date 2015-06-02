import com.aspose.ocr.*;


public class OCR {
    String[] scanIMG(String ListNameFile[]) {

        String listTextIMG[] = new String[ListNameFile.length];
        OcrEngine ocrEngine = new OcrEngine();
        OCRConfig ocrConfig = ocrEngine.getConfig();

//Set the Whitelist property to recognize numbers only
        ocrConfig.setWhitelist(new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'});
//Clear notifier list
        ocrEngine.clearNotifies();
//Clear recognition blocks
        ocrEngine.getConfig().clearRecognitionBlocks();
//Add 1 rectangle blocks to user defined recognition blocks
        ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(150, 70, 110, 40));
//Ignore everything else on the image other than the user defined recognition blocks
        ocrEngine.getConfig().setDetectTextRegions(false);
//Set Image property by loading an image from file path
        for (int i = 0; i < ListNameFile.length; i++) {
            ocrEngine.setImage(ImageStream.fromFile("img/" + ListNameFile[i]));
            if (ocrEngine.process()) {
                listTextIMG[i] = String.valueOf(ocrEngine.getText());
            }
        }
        return listTextIMG;

    }

    public static void main(String a[]) {


        //Initialize an instance of OcrEngine
        OcrEngine ocrEngine = new OcrEngine();
//Retrieve the OcrConfig of the OcrEngine object
        OCRConfig ocrConfig = ocrEngine.getConfig();

//Set the Whitelist property to recognize numbers only
        ocrConfig.setWhitelist(new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'});
//Clear notifier list
        ocrEngine.clearNotifies();

//Clear recognition blocks
        ocrEngine.getConfig().clearRecognitionBlocks();

//Add 2 rectangle blocks to user defined recognition blocks
        ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(130, 60, 110, 40));

//Ignore everything else on the image other than the user defined recognition blocks
        ocrEngine.getConfig().setDetectTextRegions(false);

//Set Image property by loading an image from file path
        ocrEngine.setImage(ImageStream.fromFile("img/003.5.jpg"));

//Run recognition process
        if (ocrEngine.process()) {
            for (IRecognizedPartInfo info : ocrEngine.getText().getPartsInfo()) {
                IRecognizedTextPartInfo textInfo = (IRecognizedTextPartInfo) info;
                System.out.println("Block: " + info.getBox() + " Text: " + textInfo.getText());
            }
        }
        /////////
/*//Initialize an instance of OcrEngine
        OcrEngine ocrEngine = new OcrEngine();

//Retrieve the OcrConfig of the OcrEngine object
        OCRConfig ocrConfig = ocrEngine.getConfig();

//Set the Whitelist property to recognize numbers only
        ocrConfig.setWhitelist(new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' });

//Set the Image property of OcrEngine object
        ocrEngine.setImage(ImageStream.fromFile("img/lol4.3.jpg"));

//Call the Process method to retrieve the results
        ocrEngine.process();
System.out.print(ocrEngine.getText());*/
    }
}
