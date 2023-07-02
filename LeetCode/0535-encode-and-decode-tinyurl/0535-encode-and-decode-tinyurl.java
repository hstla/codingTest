public class Codec {

    Map<String, String> map = new HashMap<>();

    public Codec() {
    }

    public String randomString() {
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println("generatedString = " + generatedString);

        return generatedString;
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String random = randomString();
        map.put(random, longUrl);
        return "http://tinyurl.com/" + random;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String substring = shortUrl.substring(shortUrl.length() - 6, shortUrl.length());
        String longUrl = map.get(substring);
        return longUrl;
    }
}
