package censusanalyser;

public class CensusAnalyserException extends Exception {


    public CensusAnalyserException(String message, String name) {
    }

    enum ExceptionType {
        CENSUS_FILE_PROBLEM, UNABLE_TO_PARSE
    }

    ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CensusAnalyserException(String message, ExceptionType type, Throwable name) {
        super(message, name);
        this.type = type;
    }
}
