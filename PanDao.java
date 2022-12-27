package pancard;

import java.util.ArrayList;
import java.util.List;

public class PanDao {
	public List<PanModel> getModels(){
		List<PanModel> pan=new ArrayList<>();
		pan.add(new PanModel("ganesh","ASDF373DFG"));
		pan.add(new PanModel("aneesh","ALWPG5809L"));
		pan.add(new PanModel("aneesh","kjcakjd66876sd"));
		return pan;
		
	}
}
