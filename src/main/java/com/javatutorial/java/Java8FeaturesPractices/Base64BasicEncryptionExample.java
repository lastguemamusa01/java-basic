package com.javatutorial.java.Java8FeaturesPractices;

import java.util.Base64;

public class Base64BasicEncryptionExample {

  /*

  Java provides a class Base64 to deal with encryption. You can encrypt and decrypt your data by using provided methods.
  You need to import java.util.Base64 in your source file to use its methods.

  This class provides three different encoders and decoders to encrypt information at each level.

  Basic Encoding and Decoding

  It uses the Base64 alphabet specified by Java in RFC 4648 and RFC 2045 for encoding and decoding operations.
  The encoder does not add any line separator character. The decoder rejects data that contains characters
  outside the base64 alphabet.

  Base64.Decoder
  Base64.Encoder


  URL and Filename Encoding and Decoding

  It uses the Base64 alphabet specified by Java in RFC 4648 for encoding and decoding operations.
  The encoder does not add any line separator character. The decoder rejects data that contains characters
  outside the base64 alphabet.

  MIME

  It uses the Base64 alphabet as specified in RFC 2045 for encoding and decoding operations.
  The encoded output must be represented in lines of no more than 76 characters each and uses a carriage
  return '\r' followed immediately by a linefeed '\n' as the line separator. No line separator is added
  to the end of the encoded output. All line separators or other characters not found in the base64
  alphabet table are ignored in decoding operation.

   */

  public static void main(String[] args) {

    // Getting encoder
    Base64.Encoder encoder = Base64.getEncoder();
    // Creating byte array
    byte byteArr[] = { 1, 2};
    // encoding byte array
    byte byteArr2[] = encoder.encode(byteArr);
    System.out.println("Encoded byte array: "+byteArr2);
    byte byteArr3[] = new byte[5];                // Make sure it has enough size to store copied bytes
    int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written
    System.out.println("Encoded byte array written to another array: "+byteArr3);
    System.out.println("Number of bytes written: "+x);

    // Encoding string
    String str = encoder.encodeToString("JavaTpoint".getBytes());
    System.out.println("Encoded string: "+str);
    // Getting decoder
    Base64.Decoder decoder = Base64.getDecoder();
    // Decoding string
    String dStr = new String(decoder.decode(str));
    System.out.println("Decoded string: "+dStr);


    // Getting encoder
    Base64.Encoder encoderUrl = Base64.getUrlEncoder();
    // Encoding URL
    String eStr = encoderUrl.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
    System.out.println("Encoded URL: "+eStr);
    // Getting decoder
    Base64.Decoder decoderUrl = Base64.getUrlDecoder();
    // Decoding URl
    String dStrUrl = new String(decoderUrl.decode(eStr));
    System.out.println("Decoded URL: "+dStrUrl);

    // Getting MIME encoder
    Base64.Encoder encoderMime = Base64.getMimeEncoder();
    String message = "Hello, \nYou are informed regarding your inconsistency of work";
    String eStrMime = encoderMime.encodeToString(message.getBytes());
    System.out.println("Encoded MIME message: "+eStrMime);

    // Getting MIME decoder
    Base64.Decoder decoderMime = Base64.getMimeDecoder();
    // Decoding MIME encoded message
    String dStrMime = new String(decoderMime.decode(eStrMime));
    System.out.println("Decoded message: "+dStrMime);

  }

}
