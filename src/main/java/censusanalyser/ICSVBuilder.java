package censusanalyser;

import java.io.Reader;
import java.util.Iterator;
<<<<<<< HEAD
import java.util.List;

public interface ICSVBuilder <E> {
    public Iterator<E> getCSVFileIterator(Reader reader, Class csvClass) throws CSVBuilderException;
    public List getCSVFileList(Reader reader, Class csvClass) throws CSVBuilderException;

=======

public interface ICSVBuilder <E> {
    public Iterator<E> getCSVFileIterator(Reader reader, Class csvClass) throws CensusAnalyserException;
>>>>>>> f97c193544b9825cde3123929c687fa5db9a34d6
}
