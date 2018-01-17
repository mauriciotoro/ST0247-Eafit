import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Prueba la implementacion de los metodos en la clase Taller2.
 * 
 * Ejecute esta clase para hacerse una idea de si su implementacion de
 * los ejercicios propuestos en el Taller de Clase #2 son correctos.
 * 
 * @author Mateo Agudelo
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("sumaGrupo -> " + convert(testSumaGrupo()));
		System.out.println("combinations -> " + convert(testCombinations()));
		System.out.println("permutations -> " + convert(testPermutations()));
		System.out.println("n-reinas -> " + convert(testNQueens()));
	}

	static boolean testSumaGrupo() {
		if (Taller2.sumaGrupo(0, new int[] { 2, 4, 8 }, 10) != true)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 2, 4, 8 }, 14) != true)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 2, 4, 8 }, 20) != false)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 2, 4, 8 }, 9) != false)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 2, 4, 8 }, 8) != true)
			return false;
		if (Taller2.sumaGrupo(1, new int[] { 2, 4, 8 }, 8) != true)
			return false;
		if (Taller2.sumaGrupo(1, new int[] { 2, 4, 8 }, 2) != false)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 1 }, 1) != true)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 9 }, 1) != false)
			return false;
		if (Taller2.sumaGrupo(0, new int[] {}, 0) != true)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 10, 2, 2, 5 }, 17) != true)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 10, 2, 2, 5 }, 15) != true)
			return false;
		if (Taller2.sumaGrupo(0, new int[] { 10, 2, 2, 5 }, 9) != true)
			return false;
		return true;
	}

	static boolean testCombinations() {
		String[] abc = { "", "c", "b", "bc", "a", "ac", "ab", "abc" };
		if (!equalsUnordered(abc, Taller2.combinations("abc")))
			return false;

		String[] eafit = { "", "t", "i", "it", "f", "ft", "fi", "fit", "a", "at", "ai", "ait", "af", "aft", "afi",
				"afit", "e", "et", "ei", "eit", "ef", "eft", "efi", "efit", "ea", "eat", "eai", "eait", "eaf", "eaft",
				"eafi", "eafit" };
		if (!equalsUnordered(eafit, Taller2.combinations("eafit")))
			return false;

		String[] datos = { "", "s", "o", "os", "t", "ts", "to", "tos", "a", "as", "ao", "aos", "at", "ats", "ato",
				"atos", "d", "ds", "do", "dos", "dt", "dts", "dto", "dtos", "da", "das", "dao", "daos", "dat", "dats",
				"dato", "datos" };
		if (!equalsUnordered(datos, Taller2.combinations("datos")))
			return false;

		String[] clase = { "", "e", "s", "se", "a", "ae", "as", "ase", "l", "le", "ls", "lse", "la", "lae", "las",
				"lase", "c", "ce", "cs", "cse", "ca", "cae", "cas", "case", "cl", "cle", "cls", "clse", "cla", "clae",
				"clas", "clase" };
		if (!equalsUnordered(clase, Taller2.combinations("clase")))
			return false;

		String[] prueba = { "", "a", "b", "ba", "e", "ea", "eb", "eba", "u", "ua", "ub", "uba", "ue", "uea", "ueb",
				"ueba", "r", "ra", "rb", "rba", "re", "rea", "reb", "reba", "ru", "rua", "rub", "ruba", "rue", "ruea",
				"rueb", "rueba", "p", "pa", "pb", "pba", "pe", "pea", "peb", "peba", "pu", "pua", "pub", "puba", "pue",
				"puea", "pueb", "pueba", "pr", "pra", "prb", "prba", "pre", "prea", "preb", "preba", "pru", "prua",
				"prub", "pruba", "prue", "pruea", "prueb", "prueba" };
		if (!equalsUnordered(prueba, Taller2.combinations("prueba")))
			return false;
		return true;
	}

	static boolean testPermutations() {
		String[] abc = { "abc", "acb", "bac", "bca", "cab", "cba" };
		if (!equalsUnordered(abc, Taller2.permutations("abc")))
			return false;

		String[] eafit = { "eafit", "eafti", "eaift", "eaitf", "eatfi", "eatif", "efait", "efati", "efiat", "efita",
				"eftai", "eftia", "eiaft", "eiatf", "eifat", "eifta", "eitaf", "eitfa", "etafi", "etaif", "etfai",
				"etfia", "etiaf", "etifa", "aefit", "aefti", "aeift", "aeitf", "aetfi", "aetif", "afeit", "afeti",
				"afiet", "afite", "aftei", "aftie", "aieft", "aietf", "aifet", "aifte", "aitef", "aitfe", "atefi",
				"ateif", "atfei", "atfie", "atief", "atife", "feait", "feati", "feiat", "feita", "fetai", "fetia",
				"faeit", "faeti", "faiet", "faite", "fatei", "fatie", "fieat", "fieta", "fiaet", "fiate", "fitea",
				"fitae", "fteai", "fteia", "ftaei", "ftaie", "ftiea", "ftiae", "ieaft", "ieatf", "iefat", "iefta",
				"ietaf", "ietfa", "iaeft", "iaetf", "iafet", "iafte", "iatef", "iatfe", "ifeat", "ifeta", "ifaet",
				"ifate", "iftea", "iftae", "iteaf", "itefa", "itaef", "itafe", "itfea", "itfae", "teafi", "teaif",
				"tefai", "tefia", "teiaf", "teifa", "taefi", "taeif", "tafei", "tafie", "taief", "taife", "tfeai",
				"tfeia", "tfaei", "tfaie", "tfiea", "tfiae", "tieaf", "tiefa", "tiaef", "tiafe", "tifea", "tifae" };
		if (!equalsUnordered(eafit, Taller2.permutations("eafit")))
			return false;

		String[] datos = { "datos", "datso", "daots", "daost", "dasto", "dasot", "dtaos", "dtaso", "dtoas", "dtosa",
				"dtsao", "dtsoa", "doats", "doast", "dotas", "dotsa", "dosat", "dosta", "dsato", "dsaot", "dstao",
				"dstoa", "dsoat", "dsota", "adtos", "adtso", "adots", "adost", "adsto", "adsot", "atdos", "atdso",
				"atods", "atosd", "atsdo", "atsod", "aodts", "aodst", "aotds", "aotsd", "aosdt", "aostd", "asdto",
				"asdot", "astdo", "astod", "asodt", "asotd", "tdaos", "tdaso", "tdoas", "tdosa", "tdsao", "tdsoa",
				"tados", "tadso", "taods", "taosd", "tasdo", "tasod", "todas", "todsa", "toads", "toasd", "tosda",
				"tosad", "tsdao", "tsdoa", "tsado", "tsaod", "tsoda", "tsoad", "odats", "odast", "odtas", "odtsa",
				"odsat", "odsta", "oadts", "oadst", "oatds", "oatsd", "oasdt", "oastd", "otdas", "otdsa", "otads",
				"otasd", "otsda", "otsad", "osdat", "osdta", "osadt", "osatd", "ostda", "ostad", "sdato", "sdaot",
				"sdtao", "sdtoa", "sdoat", "sdota", "sadto", "sadot", "satdo", "satod", "saodt", "saotd", "stdao",
				"stdoa", "stado", "staod", "stoda", "stoad", "sodat", "sodta", "soadt", "soatd", "sotda", "sotad" };
		if (!equalsUnordered(datos, Taller2.permutations("datos")))
			return false;

		String[] clase = { "clase", "claes", "clsae", "clsea", "cleas", "clesa", "calse", "cales", "casle", "casel",
				"caels", "caesl", "cslae", "cslea", "csale", "csael", "csela", "cseal", "celas", "celsa", "ceals",
				"ceasl", "cesla", "cesal", "lcase", "lcaes", "lcsae", "lcsea", "lceas", "lcesa", "lacse", "laces",
				"lasce", "lasec", "laecs", "laesc", "lscae", "lscea", "lsace", "lsaec", "lseca", "lseac", "lecas",
				"lecsa", "leacs", "leasc", "lesca", "lesac", "aclse", "acles", "acsle", "acsel", "acels", "acesl",
				"alcse", "alces", "alsce", "alsec", "alecs", "alesc", "ascle", "ascel", "aslce", "aslec", "asecl",
				"aselc", "aecls", "aecsl", "aelcs", "aelsc", "aescl", "aeslc", "sclae", "sclea", "scale", "scael",
				"scela", "sceal", "slcae", "slcea", "slace", "slaec", "sleca", "sleac", "sacle", "sacel", "salce",
				"salec", "saecl", "saelc", "secla", "secal", "selca", "selac", "seacl", "sealc", "eclas", "eclsa",
				"ecals", "ecasl", "ecsla", "ecsal", "elcas", "elcsa", "elacs", "elasc", "elsca", "elsac", "eacls",
				"eacsl", "ealcs", "ealsc", "eascl", "easlc", "escla", "escal", "eslca", "eslac", "esacl", "esalc" };
		if (!equalsUnordered(clase, Taller2.permutations("clase")))
			return false;

		String[] prueba = { "prueba", "prueab", "prubea", "prubae", "pruaeb", "pruabe", "preuba", "preuab", "prebua",
				"prebau", "preaub", "preabu", "prbuea", "prbuae", "prbeua", "prbeau", "prbaue", "prbaeu", "praueb",
				"praube", "praeub", "praebu", "prabue", "prabeu", "pureba", "pureab", "purbea", "purbae", "puraeb",
				"purabe", "puerba", "puerab", "puebra", "puebar", "puearb", "pueabr", "pubrea", "pubrae", "pubera",
				"pubear", "pubare", "pubaer", "puareb", "puarbe", "puaerb", "puaebr", "puabre", "puaber", "peruba",
				"peruab", "perbua", "perbau", "peraub", "perabu", "peurba", "peurab", "peubra", "peubar", "peuarb",
				"peuabr", "pebrua", "pebrau", "pebura", "pebuar", "pebaru", "pebaur", "pearub", "pearbu", "peaurb",
				"peaubr", "peabru", "peabur", "pbruea", "pbruae", "pbreua", "pbreau", "pbraue", "pbraeu", "pburea",
				"pburae", "pbuera", "pbuear", "pbuare", "pbuaer", "pberua", "pberau", "pbeura", "pbeuar", "pbearu",
				"pbeaur", "pbarue", "pbareu", "pbaure", "pbauer", "pbaeru", "pbaeur", "parueb", "parube", "pareub",
				"parebu", "parbue", "parbeu", "paureb", "paurbe", "pauerb", "pauebr", "paubre", "pauber", "paerub",
				"paerbu", "paeurb", "paeubr", "paebru", "paebur", "pabrue", "pabreu", "pabure", "pabuer", "paberu",
				"pabeur", "rpueba", "rpueab", "rpubea", "rpubae", "rpuaeb", "rpuabe", "rpeuba", "rpeuab", "rpebua",
				"rpebau", "rpeaub", "rpeabu", "rpbuea", "rpbuae", "rpbeua", "rpbeau", "rpbaue", "rpbaeu", "rpaueb",
				"rpaube", "rpaeub", "rpaebu", "rpabue", "rpabeu", "rupeba", "rupeab", "rupbea", "rupbae", "rupaeb",
				"rupabe", "ruepba", "ruepab", "ruebpa", "ruebap", "rueapb", "rueabp", "rubpea", "rubpae", "rubepa",
				"rubeap", "rubape", "rubaep", "ruapeb", "ruapbe", "ruaepb", "ruaebp", "ruabpe", "ruabep", "repuba",
				"repuab", "repbua", "repbau", "repaub", "repabu", "reupba", "reupab", "reubpa", "reubap", "reuapb",
				"reuabp", "rebpua", "rebpau", "rebupa", "rebuap", "rebapu", "rebaup", "reapub", "reapbu", "reaupb",
				"reaubp", "reabpu", "reabup", "rbpuea", "rbpuae", "rbpeua", "rbpeau", "rbpaue", "rbpaeu", "rbupea",
				"rbupae", "rbuepa", "rbueap", "rbuape", "rbuaep", "rbepua", "rbepau", "rbeupa", "rbeuap", "rbeapu",
				"rbeaup", "rbapue", "rbapeu", "rbaupe", "rbauep", "rbaepu", "rbaeup", "rapueb", "rapube", "rapeub",
				"rapebu", "rapbue", "rapbeu", "raupeb", "raupbe", "rauepb", "rauebp", "raubpe", "raubep", "raepub",
				"raepbu", "raeupb", "raeubp", "raebpu", "raebup", "rabpue", "rabpeu", "rabupe", "rabuep", "rabepu",
				"rabeup", "upreba", "upreab", "uprbea", "uprbae", "upraeb", "uprabe", "uperba", "uperab", "upebra",
				"upebar", "upearb", "upeabr", "upbrea", "upbrae", "upbera", "upbear", "upbare", "upbaer", "upareb",
				"uparbe", "upaerb", "upaebr", "upabre", "upaber", "urpeba", "urpeab", "urpbea", "urpbae", "urpaeb",
				"urpabe", "urepba", "urepab", "urebpa", "urebap", "ureapb", "ureabp", "urbpea", "urbpae", "urbepa",
				"urbeap", "urbape", "urbaep", "urapeb", "urapbe", "uraepb", "uraebp", "urabpe", "urabep", "ueprba",
				"ueprab", "uepbra", "uepbar", "ueparb", "uepabr", "uerpba", "uerpab", "uerbpa", "uerbap", "uerapb",
				"uerabp", "uebpra", "uebpar", "uebrpa", "uebrap", "uebapr", "uebarp", "ueaprb", "ueapbr", "uearpb",
				"uearbp", "ueabpr", "ueabrp", "ubprea", "ubprae", "ubpera", "ubpear", "ubpare", "ubpaer", "ubrpea",
				"ubrpae", "ubrepa", "ubreap", "ubrape", "ubraep", "ubepra", "ubepar", "uberpa", "uberap", "ubeapr",
				"ubearp", "ubapre", "ubaper", "ubarpe", "ubarep", "ubaepr", "ubaerp", "uapreb", "uaprbe", "uaperb",
				"uapebr", "uapbre", "uapber", "uarpeb", "uarpbe", "uarepb", "uarebp", "uarbpe", "uarbep", "uaeprb",
				"uaepbr", "uaerpb", "uaerbp", "uaebpr", "uaebrp", "uabpre", "uabper", "uabrpe", "uabrep", "uabepr",
				"uaberp", "epruba", "epruab", "eprbua", "eprbau", "epraub", "eprabu", "epurba", "epurab", "epubra",
				"epubar", "epuarb", "epuabr", "epbrua", "epbrau", "epbura", "epbuar", "epbaru", "epbaur", "eparub",
				"eparbu", "epaurb", "epaubr", "epabru", "epabur", "erpuba", "erpuab", "erpbua", "erpbau", "erpaub",
				"erpabu", "erupba", "erupab", "erubpa", "erubap", "eruapb", "eruabp", "erbpua", "erbpau", "erbupa",
				"erbuap", "erbapu", "erbaup", "erapub", "erapbu", "eraupb", "eraubp", "erabpu", "erabup", "euprba",
				"euprab", "eupbra", "eupbar", "euparb", "eupabr", "eurpba", "eurpab", "eurbpa", "eurbap", "eurapb",
				"eurabp", "eubpra", "eubpar", "eubrpa", "eubrap", "eubapr", "eubarp", "euaprb", "euapbr", "euarpb",
				"euarbp", "euabpr", "euabrp", "ebprua", "ebprau", "ebpura", "ebpuar", "ebparu", "ebpaur", "ebrpua",
				"ebrpau", "ebrupa", "ebruap", "ebrapu", "ebraup", "ebupra", "ebupar", "eburpa", "eburap", "ebuapr",
				"ebuarp", "ebapru", "ebapur", "ebarpu", "ebarup", "ebaupr", "ebaurp", "eaprub", "eaprbu", "eapurb",
				"eapubr", "eapbru", "eapbur", "earpub", "earpbu", "earupb", "earubp", "earbpu", "earbup", "eauprb",
				"eaupbr", "eaurpb", "eaurbp", "eaubpr", "eaubrp", "eabpru", "eabpur", "eabrpu", "eabrup", "eabupr",
				"eaburp", "bpruea", "bpruae", "bpreua", "bpreau", "bpraue", "bpraeu", "bpurea", "bpurae", "bpuera",
				"bpuear", "bpuare", "bpuaer", "bperua", "bperau", "bpeura", "bpeuar", "bpearu", "bpeaur", "bparue",
				"bpareu", "bpaure", "bpauer", "bpaeru", "bpaeur", "brpuea", "brpuae", "brpeua", "brpeau", "brpaue",
				"brpaeu", "brupea", "brupae", "bruepa", "brueap", "bruape", "bruaep", "brepua", "brepau", "breupa",
				"breuap", "breapu", "breaup", "brapue", "brapeu", "braupe", "brauep", "braepu", "braeup", "buprea",
				"buprae", "bupera", "bupear", "bupare", "bupaer", "burpea", "burpae", "burepa", "bureap", "burape",
				"buraep", "buepra", "buepar", "buerpa", "buerap", "bueapr", "buearp", "buapre", "buaper", "buarpe",
				"buarep", "buaepr", "buaerp", "beprua", "beprau", "bepura", "bepuar", "beparu", "bepaur", "berpua",
				"berpau", "berupa", "beruap", "berapu", "beraup", "beupra", "beupar", "beurpa", "beurap", "beuapr",
				"beuarp", "beapru", "beapur", "bearpu", "bearup", "beaupr", "beaurp", "baprue", "bapreu", "bapure",
				"bapuer", "baperu", "bapeur", "barpue", "barpeu", "barupe", "baruep", "barepu", "bareup", "baupre",
				"bauper", "baurpe", "baurep", "bauepr", "bauerp", "baepru", "baepur", "baerpu", "baerup", "baeupr",
				"baeurp", "aprueb", "aprube", "apreub", "aprebu", "aprbue", "aprbeu", "apureb", "apurbe", "apuerb",
				"apuebr", "apubre", "apuber", "aperub", "aperbu", "apeurb", "apeubr", "apebru", "apebur", "apbrue",
				"apbreu", "apbure", "apbuer", "apberu", "apbeur", "arpueb", "arpube", "arpeub", "arpebu", "arpbue",
				"arpbeu", "arupeb", "arupbe", "aruepb", "aruebp", "arubpe", "arubep", "arepub", "arepbu", "areupb",
				"areubp", "arebpu", "arebup", "arbpue", "arbpeu", "arbupe", "arbuep", "arbepu", "arbeup", "aupreb",
				"auprbe", "auperb", "aupebr", "aupbre", "aupber", "aurpeb", "aurpbe", "aurepb", "aurebp", "aurbpe",
				"aurbep", "aueprb", "auepbr", "auerpb", "auerbp", "auebpr", "auebrp", "aubpre", "aubper", "aubrpe",
				"aubrep", "aubepr", "auberp", "aeprub", "aeprbu", "aepurb", "aepubr", "aepbru", "aepbur", "aerpub",
				"aerpbu", "aerupb", "aerubp", "aerbpu", "aerbup", "aeuprb", "aeupbr", "aeurpb", "aeurbp", "aeubpr",
				"aeubrp", "aebpru", "aebpur", "aebrpu", "aebrup", "aebupr", "aeburp", "abprue", "abpreu", "abpure",
				"abpuer", "abperu", "abpeur", "abrpue", "abrpeu", "abrupe", "abruep", "abrepu", "abreup", "abupre",
				"abuper", "aburpe", "aburep", "abuepr", "abuerp", "abepru", "abepur", "aberpu", "aberup", "abeupr",
				"abeurp" };
		if (!equalsUnordered(prueba, Taller2.permutations("prueba")))
			return false;

		return true;
	}

	static boolean equalsUnordered(String[] a, ArrayList<String> b) {
		if (a.length != b.size())
			return false;
		TreeSet<String> set = new TreeSet<>();
		for (String s : a)
			set.add(s);
		for (String s : b)
			if (!set.contains(s))
				return false;
		return true;
	}

	static boolean testNQueens() {
		// tomado de
		// https://math.stackexchange.com/questions/1872444/how-many-solutions-are-there-to-an-n-by-n-queens-problem
		int[] soluciones = { -1, 1, 0, 0, 2, 10, 4, 40, 92 };
		for (int i = 1; i <= 8; ++i)
			if (soluciones[i] != Taller2.queens(i))
				return false;
		return true;
	}

	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}

}
