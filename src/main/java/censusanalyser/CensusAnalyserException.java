package censusanalyser;

public class CensusAnalyserException extends Exception {


    public CensusAnalyserException(String message, CSVBuilderException.ExceptionType type) {
    }

    enum ExceptionType {CENSUS_FILE_PROBLEM}
    ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
    public CensusAnalyserException(String message, ExceptionType type,Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}
