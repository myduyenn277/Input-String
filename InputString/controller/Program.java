package InputString.controller;

import InputString.Repo.IInputRepo;
import InputString.Repo.InputRepo;
import InputString.common.Validation;
import InputString.model.Input;
import InputString.view.Menu;

public class Program extends Menu<String> {
    private IInputRepo analyzeRepository;
    static String[] menuChoice = {"Input String","Get number","Get character"};
    Input i;

    public Program(){
        super("========== Analysis String program ==========", menuChoice);
        analyzeRepository = new InputRepo();
        i = new Input();
    }

    public void execute(int n){
        switch(n){
            case 1:{
                i.setValue(Validation.getString("Input String: "));
                break;
            }
            case 2:{
                analyzeRepository.getNumber(i.getValue());
                break;
            }
            case 3:{
                analyzeRepository.getCharactrer(i.getValue());
            }
        }
    }
}
