package censusanalyser;


public class CSVBuilderException extends Exception {
    public ExceptionType type;

    public CSVBuilderException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }


    public enum ExceptionType {
        UNABLE_TO_PARSE;
    }
    public CSVBuilderException(String message, CSVBuilderException.ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}
