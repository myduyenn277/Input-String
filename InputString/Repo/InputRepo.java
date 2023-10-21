package InputString.Repo;

import InputString.dataAccess.InputDao;

public class InputRepo implements IInputRepo {

    @Override
    public void getNumber(String inputString) {
        InputDao.Instance().getNumber(inputString);
    }

    @Override
    public void getCharactrer(String inputString) {
        InputDao.Instance().getCharacter(inputString);
    }
   
}
