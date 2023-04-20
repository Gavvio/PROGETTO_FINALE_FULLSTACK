package com.NegozioMusica.main.runners;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.NegozioMusica.main.entities.ChitarraAcustica;
import com.NegozioMusica.main.entities.ChitarraClassica;
import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.entities.Corda;
import com.NegozioMusica.main.repositories.CordaRepository;
import com.NegozioMusica.main.services.AmplificatoreService;
import com.NegozioMusica.main.services.ChitarraAcusticaService;
import com.NegozioMusica.main.services.ChitarraClassicaService;
import com.NegozioMusica.main.services.ChitarraElettricaService;
import com.NegozioMusica.main.services.CordaService;
import com.NegozioMusica.main.utils.ChitarreAcustiche;
import com.NegozioMusica.main.utils.ChitarreClassiche;
import com.NegozioMusica.main.utils.ChitarreElettriche;
import com.NegozioMusica.main.utils.TipoCorde;


@Component
public class MainRunner implements ApplicationRunner {
	@Autowired
	ChitarraElettricaService elchitServ;
	@Autowired
	ChitarraClassicaService classchitServ;
	@Autowired
	ChitarraAcusticaService acustchiServ;
	@Autowired
	CordaService cordaServ;
	@Autowired 
	AmplificatoreService ampServ;

	void creaChitarraElettrica(String colore, String controlli, String corpo, String inlay, String larghezza,
			String lunghezza, String manico, String pickup, int tasti, String tastiera, double prezzo, String modello,
			ChitarreElettriche tipo, String marca, String tremolo, String immagine) {
		ChitarraElettrica chitmom = new ChitarraElettrica();
		chitmom.setColore(colore);
		chitmom.setControlli(controlli);
		chitmom.setCorpo(corpo);
		chitmom.setInlay(inlay);
		chitmom.setLarghezza_scala(larghezza);
		chitmom.setLunghezza_scala(lunghezza);
		chitmom.setManico(manico);
		chitmom.setPickup(pickup);
		chitmom.setPrezzo(prezzo);
		chitmom.setTasti(tasti);
		chitmom.setTastiera(tastiera);
		chitmom.setModello(modello);
		chitmom.setTipoElettrica(tipo);
		chitmom.setMarca(marca);
		chitmom.setImmagine(immagine);
		chitmom.setTremolo(tremolo);
		elchitServ.chitarraElettricaSalvaAggiorna(chitmom);
	}
	
	void creaChitarraClassica(String modello,String marca,String immagine, String corpo,String tastiera,String larghezza,String lunghezza,String corde,String colore,double prezzo,ChitarreClassiche tipo) {
		ChitarraClassica chitmom= new ChitarraClassica();
		chitmom.setColore(colore);
		chitmom.setCorpo(corpo);
		chitmom.setImmagine(immagine);
		chitmom.setLarghezza_scala(larghezza);
		chitmom.setLunghezza_scala(lunghezza);
		chitmom.setMarca(marca);
		chitmom.setModello(modello);
		chitmom.setPrezzo(prezzo);
		chitmom.setTastiera(tastiera);
		chitmom.setTipoClassica(tipo);
		classchitServ.chitarraClassicaSalvaAggiorna(chitmom);
	}
	
	void creaChitarraAcustica(String modello,String marca,String immagine, String corpo,String tastiera,String larghezza,String lunghezza,String colore,double prezzo,ChitarreAcustiche tipo) {
		ChitarraAcustica chitmom= new ChitarraAcustica();
		chitmom.setColore(colore);
		chitmom.setCorpo(corpo);
		chitmom.setImmagine(immagine);
		chitmom.setLarghezza_scala(larghezza);
		chitmom.setLunghezza_scala(lunghezza);
		chitmom.setMarca(marca);
		chitmom.setModello(modello);
		chitmom.setPrezzo(prezzo);
		chitmom.setTastiera(tastiera);
		chitmom.setTipoAcustica(tipo);
		acustchiServ.chitarraAcusticaSalvaAggiorna(chitmom);
	}
	
	public void creaCorda(String modello,String marca,String gauge,String materiale,double prezzo,String immagine,TipoCorde tipoCorde) {
		Corda mom=new Corda();
		mom.setGauge(gauge);
		mom.setMarca(marca);
		mom.setMateriale(materiale);
		mom.setModello(modello);
		mom.setPrezzo(prezzo);
		mom.setTipoCorde(tipoCorde);
		mom.setImmagine(immagine);
		cordaServ.cordaSalvaAggiorna(mom);
	}
	
	public void creaAmplificatore() {
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("main runner on");
		
		//CREA ELETTRICHE
		
//      creaElettriche();
//		creaClassiche();
//		creaAcustiche();
		creaCorde();

	}
	
	public void creaElettriche() {
		creaStratocasters();
		creaTelecasters();
		creaSingleCuts();
		creaDoubleCuts();
		creaSemiAcustiche();
		creaHeavy();
	}
	
	public void creaClassiche() {
		creaUnOttavo();
		creaUnQuarto();
		creaUnMezzo();
		creaTreQuarti();
		creaSetteOttavi();
		creaQuattroQuarti();
	}
	
	public void creaAcustiche() {
		creaDreadnought();
		creaJumbo();
		creaFolk();
		creaOoooo();
		creaRoundback();
		creaDaViaggio();
	}
	
	public void creaCorde() {
//		crea08();
//		crea09();
//		crea10();
//		crea11();
//		creaStandard();
//		creaCarbonio();
//		crea10Acustica();
//		crea11Acustica();
//		crea12();
//		crea13();
//		creaSteel();
//		creaAcustici();
//		crea40();
//		crea45();
//		crea50();
//		crea40cinque();
//		crea45cinque();
	}

	public void creaStratocasters(){
		
		// 10 STRATOCASTERS

		creaChitarraElettrica("sunburst a 3 toni", "1 volume, 2 tono", "ontano", "punti bianchi", "42mm", "648mm", "acero", "3 Custom Shop Texas single coil", 21, "palissandro", 2590, "Stevie Ray Vaughan", ChitarreElettriche.STRATOCASTER, "Fender","no", "../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/Stevie Ray Vaughan ricerca.jpg");
	
		creaChitarraElettrica("marea", "1 volume, 2 tono", "ontano", "punti neri", "42mm", "648mm", "acero", " 1 humbucker New Player AlNiCo II (ponte) e 2 single coil New Player AlNiCo V (centrale e manico)", 22, "acero", 798, "Player Series Strat HSS MN TPL", ChitarreElettriche.STRATOCASTER, "Fender","no", "../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/Player Series Strat HSS MN TPL ricerca.jpg");


		creaChitarraElettrica("rosa di mezzanotte", "1 volume, 2 tono", "ontano", "Small Bird", "42mm", "648mm", "acero", "3 635JM single coil", 22, "acero", 2799, "John Mayer Silver Sky MN MR", ChitarreElettriche.STRATOCASTER, "PRS","no", "../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/John Mayer Silver Sky MN MR ricerca.jpg");
	
		creaChitarraElettrica("bagliore di loto in fiore", "1 volume, 1 tono", "mogano africano a nastro", "Cozza rosa e vite di loto in madreperla", "42,9mm", "635mm", "mogano", " 2 humbucker 58/15", 24, "palissandro", 11990, "Private Stock Orianthi LTD", ChitarreElettriche.STRATOCASTER, "PRS","no", "../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/Private Stock Orianthi LTD ricerca.jpg");

		
		creaChitarraElettrica("sunburts a 3 toni lucido","1 volume, 2 tono","tiglio","punti bianchi","42mm","648mm","acero, imbullonato","3 single coil style ST",22,"roseacer",89,"ST-20 SB Standard Series",ChitarreElettriche.STRATOCASTER,"Harley Benton","no","../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/ST-20 SB Standard Series ricerca.jpg");
		
		creaChitarraElettrica("rosso sangue lucente", "1 volume, 1 tono", "pioppo", "punti bianchi offset", "43mm", "648mm", "acero, imbullonato", "2 Artec Ceramic", 24, "amaranto", 159, "R-446 Blood Metallic", ChitarreElettriche.STRATOCASTER, "Harley Benton", "no","../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/R-446 Blood Metallic ricerca.jpg");
		

		creaChitarraElettrica("bianco neve","1 volume, 1 tono","mogano","blocchi sfalsati bianco perlato","42mm","648mm","acero, 3 pezzi,continuo","humbucker EMG F-57 Brushed Gold (ponte) e EMG 66TW Brushed Gold (manico)",24,"ebano",1555,"LTD H3-1000FR Snow White",ChitarreElettriche.STRATOCASTER,"ESP","Floyd Rose","../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/LTD H3-1000FR Snow White ricerca.jpg");

		creaChitarraElettrica("ambra occhio di tigre dissolvenza","1 volume, 1 tono","mogano","blocchi sfalsati bianco perlato","42mm","648mm","acero, 3 pezzi","EMG attivo 57 TW (ponte) - EMG attivo 66 TW (manico)",24,"ebano",2599,"E-II Horizon NT II TE AM Fade",ChitarreElettriche.STRATOCASTER,"ESP","no","../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/E-II Horizon NT II TE AM Fade ricerca.jpg");


		creaChitarraElettrica("burst nero trasparente","1 volume, 1 tono","ontano","punti Abalone","42mm","648mm","acero tostato, imbullonato","1 S7 Zebra Humbucker (ponte) e 2 S7 Single Coil (centrale e manico)",22,"acero tostato",585,"S7FM TBK 2nd Gen",ChitarreElettriche.STRATOCASTER,"Larry Carlton","no","../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/S7FM TBK 2nd Gen ricerca.jpg");

		creaChitarraElettrica("bianco antico","1 volume, 1 tono","ontano","punti Abalone","42mm","648mm","acero tostato, imbullonato","1 S7 Zebra Humbucker (ponte) e 2 S7 Single Coil (centrale e manico)",22,"acero tostato",499,"S7 AWH",ChitarreElettriche.STRATOCASTER,"Larry Carlton","no","../../../assets/immagini_prodotti/chitarre_elettriche/stratocasters/S7 AWH ricerca.jpg");
		
	}
	
	public void creaTelecasters() {
		
		// 10 TELECASTERS

  	creaChitarraElettrica("ultra burst","1 volume, 1 tono","ontano","punti bianchi perlati","42,8mm","648mm","acero, imbullonato","2 Single Coil Tele vintage ultra silenziosi",22,"palissandro",2299,"AM Ultra Tele RW Ultraburst",ChitarreElettriche.TELECASTER,"Fender","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/AM Ultra Tele RW Ultraburst ricerca.jpg");
		
		creaChitarraElettrica("naturale design drago","1 volume, 1 tono","frassino","punti bianchi","41,9mm","648mm","acero, imbullonato","2 Single Coil Jimmy Page Custom Tele",21,"palissandro",1590,"Jimmy Page Telecaster RW NAT",ChitarreElettriche.TELECASTER,"Fender","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/Jimmy Page Telecaster RW NAT ricerca.jpg");


		creaChitarraElettrica("ciliegia nera trasparente","1 volume, 1 tono","mogano","punti neri sfalsati","42mm","648mm","acero, imbullonato a 3 strisce","humbucker ESP Designed LH-150N (manico) e ESP Designed LH-150B (ponte)",24,"acero",385,"LTD TE-200 Maple STBC B-Stock",ChitarreElettriche.TELECASTER,"ESP","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/LTD TE-200 Maple STBC B-Stock ricerca.jpg");
		
		creaChitarraElettrica("esplosione nera","1 volume, 1 tono","frassino","punti bianchi sfalsati","42mm","648mm","acero tostato, imbullonato","Seymour Duncan Pegasus (bridge) and Seymour Duncan Sentient (neck) humbuckers",22,"acero tostato",1274,"LTD TE-1000 Black Blast",ChitarreElettriche.TELECASTER,"ESP","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/LTD TE-1000 Black Blast ricerca.jpg");


		creaChitarraElettrica("blu lago tranquillo lucido","1 volume, 1 tono","pioppo","punti bianchi","42mm","648mm","acero  caramello vintage, imbullonato"," 2 Roswell Alnico 5 TEA-F-CR/TEA-B single coils",21,"alloro",159,"TE-62DB LPB",ChitarreElettriche.TELECASTER,"Harley Benton","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/TE-62DB LPB ricerca.jpg");
		
		creaChitarraElettrica("verde schiuma di mare","1 volume, 1 tono","pioppo","punti neri","42mm","648mm","acero caramello, imbullonato","2 Roswell AlNiCo 5 TEA-F-CR/TEA-B single coils",21,"acero",149,"TE-62CC SFG",ChitarreElettriche.TELECASTER,"Harley Benton","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/TE-62CC SFG ricerca.jpg");


	    creaChitarraElettrica("blu trasparente","1 volume, 1 tono","ontano con impiallacciatura in acero marezzato","punti abalone","42mm","648mm","acero tostato, imbullonato","humbucker T7 (ponte), humbucker T7 (manico)",22,"acero tostato",599,"T7 FM TBL",ChitarreElettriche.TELECASTER,"Larry Carlton","T7 2-post tremolo (Steel Block and Stainless Steel Saddles)","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/T7 FM TBL ricerca.jpg");

      creaChitarraElettrica("rosso fiesta","1 volume, 1 tono","ontano","punti abalone","42mm","648mm","acero tostato, imbullonato","2 T7 single coils",22,"acero tostato",666,"T7 FR LH",ChitarreElettriche.TELECASTER,"Larry Carlton","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/T7 FR LH ricerca.jpg");


		creaChitarraElettrica("esplosione blu","1 volume, 1 tono","ontano","punti neri","42mm","648mm","acero tostato","Schecter USA Z-Plus (ponte e manico)",22,"acero tostato",799,"PT Pro Trans Blue Burs B-Stock",ChitarreElettriche.TELECASTER,"Schecter","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/PT Pro Trans Blue Burs B-Stock ricerca.jpg");

      creaChitarraElettrica("rosa Tickets To My Downfall","1 volume, 1 killswitch","ontano","doppia X bianca","42mm","648mm","acero,imbullonato","Schecter USA Pasadena Plus humbucker (ponte)",24,"ebano",1299,"Machine Gun Kelly Signature PT",ChitarreElettriche.TELECASTER,"Schecter","no","../../../assets/immagini_prodotti/chitarre_elettriche/telecasters/Machine Gun Kelly Signature PT ricerca.jpg");
		
	}
	
	public void creaSingleCuts(){
		
		// 10 SINGLE CUT
		
		creaChitarraElettrica("Vermillion Burst","2 volume, 2 tono","mogano","parallelogrammi perlati","43mm","628mm","mogano","2 Custom ProBucker humbuckers",22,"alloro",598,"Slash Les Paul VermillionBurst",ChitarreElettriche.SINGLECUT,"Epiphone","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/Slash Les Paul VermillionBurst ricerca.jpg");
		
		creaChitarraElettrica("bianco classico","1 volume, 1 tono","mogano","punti bianchi","43mm","629mm","mogano, incastonato","1 Epiphone Pro P-90 single coil",22,"alloro",498,"Billie Joe Armstrong LP Junior",ChitarreElettriche.SINGLECUT,"Epiphone","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/Billie Joe Armstrong LP Junior ricerca.jpg");


		creaChitarraElettrica("blu naturale sfumato","2 volume, 1 tono","mogano","bandiere bianche","42mm","629mm","ebano","1 Seymour Duncan Pegasus (ponte) e 1 Seymour Duncan Sentient (manico) humbucker",24,"ebano",1099,"LTD EC-1000 BP BLUNFD",ChitarreElettriche.SINGLECUT,"ESP","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/LTD EC-1000 BP BLUNFD ricerca.jpg");
		
		creaChitarraElettrica("bianco neve con strisce nere","2 volume, 1 tono","mogano","bandiere bianche","42mm","629mm","mogano, incastonato","Active EMG JH SET (ponte) e Active EMG JH SET (manico)",22,"ebano",1590,"LTD Iron Cross SW",ChitarreElettriche.SINGLECUT,"ESP","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/LTD Iron Cross SW ricerca.jpg");


		creaChitarraElettrica("esplosione miele vintage","2 volume, 2 tono","mogano","trapezi bianchi","43mm","628,65mm","mogano","1 Burstbucker (manico) e 1 Burstbucker (ponte) humbucker",22,"palissandro",2499,"Les Paul Standard 50s Faded",ChitarreElettriche.SINGLECUT,"Gibson","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/Les Paul Standard 50s Faded ricerca.jpg");
		
		creaChitarraElettrica("Heritage esplosione ciliegia","2 volume, 2 tono","mogano","trapezi bianchi","43mm","628mm","mogano","Burstbucker 61R (manico) e Burstbucker 61T (ponte) humbucker",22,"palissandro",1999,"Les Paul Classic HCS",ChitarreElettriche.SINGLECUT,"Gibson","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/Les Paul Classic HCS ricerca.jpg");
		
		creaChitarraElettrica("ciliegia traslucido","2 volume, 2 tono","mogano","trapezi bianchi"," 43.05mm","628.65mm","mogano","Pickup humbucker Burstbucker 61R (manico) e Burstbucker 61T (ponte)",22,"palissandro",2099,"Les Paul Classic TC",ChitarreElettriche.SINGLECUT,"Gibson","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/Les Paul Classic TC ricerca.jpg");
		
		creaChitarraElettrica("nero","2 volume, 2 tono","mogano","blocchi madreperla","43mm","628mm","mogano","humbucker Gibson 490R (manico) e 498T (ponte)",22,"ebano",4499,"Les Paul Custom EB GH",ChitarreElettriche.SINGLECUT,"Gibson","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/Les Paul Custom EB GH ricerca.jpg");
		
		creaChitarraElettrica("esplosione argento lucido","2 volume, 2 tono","mogano","trapezi bianchi","42mm","628mm","mogano, incollato","2 humbucker Tesla Opus-1 AlNiCo-5",22,"pau ferro",298,"SC-550 II Silver Burst",ChitarreElettriche.SINGLECUT,"Harley Benton","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/SC-550 II Silver Burst ricerca.jpg");
		
		creaChitarraElettrica("bianco","2 volume, 2 tono","tiglio","blocchi bianchi","43mm","628mm","acero, incassato"," 2 vintage style humbuckers",22,"blackwood",169,"SC-500 WH Vintage Series",ChitarreElettriche.SINGLECUT,"Harley Benton","no","../../../assets/immagini_prodotti/chitarre_elettriche/single_cut/SC-500 WH Vintage Series ricerca.jpg");
		
	}
	
	public void creaDoubleCuts() {
		
		// 10 DOUBLE CUT
		
		creaChitarraElettrica("ciliegia vintage", "2 volume, 2 tono", "mogano", "trapezi bianchi", "43mm", "628mm", "mogano", "2 60's burstbucker humbuckers", 22, "palissandro", 1855, "SG Standard '61 Faded Maestro", ChitarreElettriche.DOUBLECUT,"Gibson", "Maestro Vibrola", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/SG Standard '61 Faded Maestro ricerca.jpg");

		creaChitarraElettrica("bianco classico, fortemente invecchiato", "2 volume, 2 tono", "mogano", "trapezi bianchi", "43mm", "628mm", "mogano", "2 Custombucker Alnico III unwaxed", 22, "palissandro", 6699, "SG Standard ´61 CW Murphy HA", ChitarreElettriche.DOUBLECUT,"Gibson", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/SG Standard ´61 CW Murphy HA ricerca.jpg");
	
		creaChitarraElettrica("fiamma smeraldo", "1 volume, 1 tono", "mogano", "punti bianchi", "42mm", "635mm", "mogano, incastonato", "2 Roswell HAF AlNiCo-5 open coil humbuckers", 24, "pau ferro", 269, "CST-24T Emerald Flame", ChitarreElettriche.DOUBLECUT,"Harley Benton", "Wilkinson WVPC", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/CST-24T Emerald Flame ricerca.jpg");
	
		creaChitarraElettrica("blu Pelham", "1 volume, 1 tono", "mogano", "punti bianchi", "43mm", "628mm", "mogano", "Roswell P90D Alnico-5 Dog Ear single coil (bridge)", 22, "amaranto", 199, "DC-Junior Pelham Blue", ChitarreElettriche.DOUBLECUT,"Harley Benton", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/DC-Junior Pelham Blue ricerca.jpg");
	
		creaChitarraElettrica("gradazione blu trasparente", "2 volume, 2 tono", "okume", "blocchi abalone", "43mm", "628mm", "mogano", "2 Super 58 humbuckers", 22, "jatoba", 648, "AR420-TBG", ChitarreElettriche.DOUBLECUT,"Ibanez", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/AR420-TBG ricerca.jpg");
	
		creaChitarraElettrica("violino sunburst", "2 volume, 2 tono", "okumè", "blocchi abalone", "43mm", "628mm", "acero", "2 Super 58 humbuckers", 22, "jatoba", 648, "AR420-VLS", ChitarreElettriche.DOUBLECUT,"Ibanez", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/AR420-VLS ricerca.jpg");
	
		creaChitarraElettrica("marrone scuro sunburst", "2 volume, 2 tono", "mogano", "blocchi abalone", "43mm", "628mm", "acero", "2 Super 58 humbucker", 22, "jatoba", 619, "AR325QA-DBS", ChitarreElettriche.DOUBLECUT,"Ibanez", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/AR325QA-DBS ricerca.jpg");
		
		creaChitarraElettrica("ciliegia trasparente", "1 volume, 1 tono", "tiglio", "blocchi abalone", "43mm", "628mm", "acero", "2 Humbucker Infinity", 22, "jatoba", 242, "GAX30-TCR", ChitarreElettriche.DOUBLECUT,"Ibanez", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/GAX30-TCR ricerca.jpg");
		
		creaChitarraElettrica("verde invernale", "2 volume, 2 tono", "mogano", "punti bianchi", "43mm", "629mm", "mogano", "2 single coil Epiphone P-90 PRO (Soap Bar)", 22, "alloro", 375, "SG Classic Worn P-90 Green", ChitarreElettriche.DOUBLECUT,"Epiphone", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/SG Classic Worn P-90 Green ricerca.jpg");

		creaChitarraElettrica("ebano", "2 volume, 2 tono", "mogano", "trapezi bianchi", "43mm", "629mm", "mogano", "2 humbucker Alnico Classic Pro (manico e ponte)", 22, "alloro", 444, "SG Standard Ebony", ChitarreElettriche.DOUBLECUT,"Epiphone", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/double_cut/SG Standard Ebony ricerca.jpg");

	}
	
	public void creaSemiAcustiche() {
		
		//10 SEMIACUSTICHE
		
		creaChitarraElettrica("tè dolce", "3 volume, 1 tono", "acero laminato", "neoclassici perlati", "43mm", "625mm", "acero, incollato", "2 Black Top Broad'Tron humbuckers", 22, "alloro", 899, "G5655T-QM Electromatic Jr. ST", ChitarreElettriche.SEMIACUSTICHE, "Gretsch", "Bigsby-Licensed B70 tremolo", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/G5655T-QM Electromatic Jr. ST ricerca.jpg");
		
		creaChitarraElettrica("bianco", "3 volume, 1 tono", "acero laminato, 3 strati", "blocco perlato con gobba inciso", "42,62mm", "648mm", "acero, striscia di noce", "2 TV Jones T-Armonds", 22, "ebano", 4190, "G6136T-55VS White Falcon", ChitarreElettriche.SEMIACUSTICHE, "Gretsch", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/G6136T-55VS White Falcon ricerca.jpg");

		creaChitarraElettrica("azzurro metallico", "3 volume, 1 tono", "acero laminato, blocco a cavalletto", "neoclassici perlati", "43mm", "625mm", "acero", "2 humbucker FT-5E FilterTron", 22, "alloro", 798, "G5420T Electromatic AM", ChitarreElettriche.SEMIACUSTICHE, "Gretsch", "Bigsby B60", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/G5420T Electromatic AM ricerca.jpg");
		
		creaChitarraElettrica("macchia arancione", "3 volume, 1 tono", "acero laminato, blocco a cavalletto", "blocco perlato con gobba inciso", "43mm", "625mm", "acero", "2 FT-5E FilterTron humbuckers", 22, "alloro", 990, "G5422TG Electromatic OS", ChitarreElettriche.SEMIACUSTICHE, "Gretsch", "Bigsby B60", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/G5422TG Electromatic OS ricerca.jpg");
		
		creaChitarraElettrica("ciliegia '60s VOS", "2 volume, 2 tono", "acero/pioppo/acero", "blocchi piccoli", "43mm", "628mm", "mogano", "2 Custombucker Alnico III (unpotted) humbuckers", 22, "palissandro", 5499, "1964 ES-335 Reissue 60s CH VOS", ChitarreElettriche.SEMIACUSTICHE, "Gibson", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/1964 ES-335 Reissue 60s CH VOS ricerca.jpg");
	
		creaChitarraElettrica("ebano vintage", "2 volume, 2 tono", "acero", "punti bianchi", "43mm", "628mm", "mogano", "2 Calibrated T-Type humbuckers", 22, "palissandro", 3199, "ES-335 Dot Vintage Ebony", ChitarreElettriche.SEMIACUSTICHE, "Gibson", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/ES-335 Dot Vintage Ebony ricerca.jpg");

		creaChitarraElettrica("azzurro cielo", "2 volume, 2 tono", "acero", "blocchi perlati", "43mm", "635mm", "acero", "1 Seymour Duncan designed HB-102N humbucker (manico) and 1 Seymour Duncan designed HB 101B humbucker (ponte)", 22, "ovangkol", 744, "Premier Mini DC Sky Blue", ChitarreElettriche.SEMIACUSTICHE, "DAngelico", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/Premier Mini DC Sky Blue ricerca.jpg");
	
		creaChitarraElettrica("tè ghiacciato", "2 volume, 2 tono", "acero", "blocchi perlati abalone", "42,9mm", "635mm", "acero/noce/acero", "2 humbucker Seymour Duncan 59", 22, "palissandro", 1777, "Excel SS XT Iced Tea Quilt", ChitarreElettriche.SEMIACUSTICHE, "DAngelico", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/Excel SS XT Iced Tea Quilt ricerca.jpg");
		
		creaChitarraElettrica("goccia di limone", "2 volume, 2 tono", "acero", "blocchi bianchi", "42mm", "628mm", "acero", "2 Roswell LAF Alnico-5 vintage-style humbucker", 22, "alloro", 249, "HB-35Plus Lemon", ChitarreElettriche.SEMIACUSTICHE, "Harley Benton", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/HB-35Plus Lemon ricerca.jpg");

		creaChitarraElettrica("ciliegia sunburst", "2 volume, 2 tono", "mogano con attacchi", "punti bianchi", "42mm", "628mm", "acero, set-in", "2 humbucker Artec Classic Mini", 22, "amaranto", 249, "RB-600CS Classic Series", ChitarreElettriche.SEMIACUSTICHE, "Harley Benton", "no", "../../../assets/immagini_prodotti/chitarre_elettriche/semiacustiche/RB-600CS Classic Series ricerca.jpg");

	}
	
	public void creaHeavy() {
		
		// 10 HEAVY

		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");

		creaChitarraElettrica("rosso ferrari", "1 volume, 1 tono", "pioppo", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "2 Jackson high-output humbuckers", 24, "amaranto", 347, "JS32 Kelly Ferrari Red AH", ChitarreElettriche.HEAVY, "Jackson", "Floyd Rose licensed double locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/JS32 Kelly Ferrari Red AH ricerca.jpg");
	
		creaChitarraElettrica("viola trasparente", "1 volume, 1 tono", "ontano", "punti madreperla", "43mm", "648mm", "acero", "Seymour Duncan Trembucker(ponte) e humbucker Jazz (manico)", 24, "ebano", 8222, "Soloist SL2H QMT Purple USA", ChitarreElettriche.HEAVY, "Jackson", "Original Floyd Rose","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/Soloist SL2H QMT Purple USA ricerca.jpg");
	
		creaChitarraElettrica("rosso ferrari", "1 volume, 1 tono", "ontano selezionato", "punti blu laterali", "43mm", "648mm", "acero", "2 DiMarzio Occult Classic humbuckers", 24, "ebano", 8799, "Dave Davidson Warrior FR LTD", ChitarreElettriche.HEAVY, "Jackson", "Floyd Rose Original Double Locking 2-Point","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/Dave Davidson Warrior FR LTD ricerca.jpg");
	
		creaChitarraElettrica("nero lucido", "1 volume, 1 tono", "tiglio", "punti bianchi", "43mm", "648mm", "acero", "2 humbucker high gain", 24,"amaranto", 119, "WL-20BK Rock Series", ChitarreElettriche.HEAVY, "Harley Benton", "no","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/WL-20BK Rock Series ricerca.jpg");
		
		creaChitarraElettrica("naturale antico", "2 volume, 1 tono", "mogano", "punti bianchi", "42mm", "628mm", "mogano, incollato", "2 humbucker Roswell LAF AlNiCo-5", 22, "amaranto", 355, "EX-76 Classic GHW AN", ChitarreElettriche.HEAVY, "Harley Benton", "no","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/EX-76 Classic GHW AN ricerca.jpg");
	
		creaChitarraElettrica("consumato e bruciato", "1 volume, 1 tono", "ontano", "punti bianchi grandi", "42mm", "648mm", "acero", "active EMG 81 (ponte) and EMG 81 (manico) humbuckers", 24, "palissandro", 3199, "E-II RZK-II Burnt", ChitarreElettriche.HEAVY, "ESP", "Original Floyd Rose","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/E-II RZK-II Burnt ricerca.jpg");
		
		creaChitarraElettrica("nero opaco", "2 volume", "mogano", "punti bianchi", "42mm", "628mm", "mogano", "2 Active EMG JH humbuckers", 22, "ebano", 5399, "Snakebyte BLKS James Hetfield", ChitarreElettriche.HEAVY, "ESP", "no","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/Snakebyte BLKS James Hetfield ricerca.jpg");
	
		creaChitarraElettrica("esplosione oro satinato", "1 volume, 1 tono", "mogano", "punti laterali luce nel buio", "41,3mm", "648mm", "mogano", "Sustainiac (ponte) and Schecter USA Synyster Gates signature humbucker (manico)", 24, "ebano", 1799, "Synyster Gates Custom S SGB", ChitarreElettriche.HEAVY, "Schecter", "Floyd Rose 1500 Series","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/Synyster Gates Custom S SGB ricerca.jpg");

		creaChitarraElettrica("esplosione antica sbiadita", "1 volume, 1 tono", "frassino", "punti inversi", "42mm", "648mm", "acero", "Fishman Fluence Modern ceramic magnet (ponte) humbucker - Sustainiac (manico)", 24, "ebano", 1855, "C-1 SLS Elite FR S AFB", ChitarreElettriche.HEAVY, "Schecter", "Floyd Rose 1500 Series","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/C-1 SLS Elite FR S AFB ricerca.jpg");

	}
	
	public void creaUnOttavo(){
	    creaChitarraClassica("CG 851 1/8", "Startone", "../../../assets/immagini_prodotti/chitarre_classiche/1-8/CG 851 1-8 ricerca.jpg", "tiglio", "acero", "39mm", "465mm", "nylon", "marrone chiaro satinato", 38, ChitarreClassiche.UNOTTAVO);
		creaChitarraClassica("GL1 Tobacco Brown Sunburst", "Yamaha", "../../../assets/immagini_prodotti/chitarre_classiche/1-8/GL1 Tobacco Brown Sunburst ricerca.jpg", "meranti", "sonokeling", "47,5mm", "433mm", "nylon", "sunburst marrone tabacco", 98, ChitarreClassiche.UNOTTAVO);
	}
	
	public void creaUnQuarto() {
		creaChitarraClassica("Student Natural 1/4", "Gewa", "../../../assets/immagini_prodotti/chitarre_classiche/1-4/Student Natural 1-4 ricerca.jpg", "okume", "blackwood tek", "43mm", "450mm", "nylon", "naturale lucido", 137, ChitarreClassiche.UNQUARTO);
		creaChitarraClassica("R121-1/4 NT", "Ortega", "../../../assets/immagini_prodotti/chitarre_classiche/1-4/R121-1-4 NT ricerca.jpg", "mogano", "noce", "43,5mm", "438mm", "nylon", "naturale", 178, ChitarreClassiche.UNQUARTO);
	}
	
	public void creaUnMezzo() {
		creaChitarraClassica("Granito 33-N-MB-1/2", "La Mancha", "../../../assets/immagini_prodotti/chitarre_classiche/1-2/Granito 33-N-MB-1-2 ricerca.jpg", "mogano", "ovangkol", "46mm", "530mm", "nylon", "esplosione mogano", 151, ChitarreClassiche.UNMEZZO);
		creaChitarraClassica("CG-851 1/2 Red", "Startone", "../../../assets/immagini_prodotti/chitarre_classiche/1-2/CG-851 1-2 Red ricerca.jpg", "basswood", "acero", "45mm", "550mm", "nylon", "rosso satinato", 40, ChitarreClassiche.UNMEZZO);
	}
	
	public void creaTreQuarti() {
		creaChitarraClassica("Classic Guitar 3/4 Black", "Thomann", "../../../assets/immagini_prodotti/chitarre_classiche/3-4/Classic Guitar 3-4 Black ricerca.jpg", "abete", "acero", "47mm", "550mm", "nylon", "nero lucido", 129, ChitarreClassiche.TREQUARTI);
		creaChitarraClassica("ESC80 Educational 3/4 NT", "Fender", "../../../assets/immagini_prodotti/chitarre_classiche/3-4/ESC80 Educational 3-4 NT ricerca.jpg", "abete", "noce", "44,5mm", "590mm", "nylon", "vintage, tinte naturali, satinato", 122, ChitarreClassiche.TREQUARTI);
	}
	
	public void creaSetteOttavi() {
		creaChitarraClassica("HM65-Z-S Senorita", "Höfner", "../../../assets/immagini_prodotti/chitarre_classiche/7-8/HM65-Z-S Senorita ricerca.jpg", "mogano", "palissandro", "50mm", "630mm", "nylon", "naturale opaco", 888, ChitarreClassiche.SETTEOTTAVI);
		creaChitarraClassica("Pro Natura Silver 7/8 Maple", "Gewa", "../../../assets/immagini_prodotti/chitarre_classiche/7-8/Pro Natura Silver 7-8 Maple ricerca.jpg", "acero", "acacia", "48mm", "620mm", "nylon", "seta opaca", 159, ChitarreClassiche.SETTEOTTAVI);
	}
	
	public void creaQuattroQuarti() {
		creaChitarraClassica("CG200CE-BK", "Harley Benton", "../../../assets/immagini_prodotti/chitarre_classiche/4-4/CG200CE-BK ricerca.jpg", "tiglio", "acero", "52mm", "650mm", "nylon", "nero lucido", 69, ChitarreClassiche.QUATTROQUARTI);
		creaChitarraClassica("Fusion Orchestra CE Cedar", "Cordoba", "../../../assets/immagini_prodotti/chitarre_classiche/4-4/Fusion Orchestra CE Cedar ricerca.jpg", "cedro", "mogano", "48mm", "650mm", "nylon", "naturale lucido", 809, ChitarreClassiche.QUATTROQUARTI);
	}
	
	public void creaDreadnought() {
		creaChitarraAcustica("Custom Line CLD-41SE WN", "Harley Benton", "../../../assets/immagini_prodotti/chitarre_acustiche/dreadnought/Custom Line CLD-41SE WN ricerca.jpg", "noce", "pau ferro", "43mm", "643mm", "opaco naturale", 375, ChitarreAcustiche.DREADNOUGHT);
		
		creaChitarraAcustica("MR500E Open Pore Brown", "Cort", "../../../assets/immagini_prodotti/chitarre_acustiche/dreadnought/MR500E Open Pore Brown ricerca.jpg", "mogano", "ovangkol", "43mm", "643mm", "opaco naturale", 299, ChitarreAcustiche.DREADNOUGHT);
	}
	
	public void creaJumbo() {
		creaChitarraAcustica("G5022CWFE Falcon Rancher", "Gretsch", "../../../assets/immagini_prodotti/chitarre_acustiche/jumbo/G5022CWFE Falcon Rancher ricerca.jpg", "mogano", "palissandro", "43mm", "635mm", "bianco, dettagli oro scintillante", 645, ChitarreAcustiche.JUMBO);
		
		creaChitarraAcustica("G-200 EC Natural Generation", "Gibson", "../../../assets/immagini_prodotti/chitarre_acustiche/jumbo/G-200 EC Natural Generation ricerca.jpg", "noce", "ebano", "43,80mm", "648mm", "naturale", 1699, ChitarreAcustiche.JUMBO);
	}

	public void creaFolk() {
		creaChitarraAcustica("G9500 Jim Dandy Flat Top", "Gretsch", "../../../assets/immagini_prodotti/chitarre_acustiche/folk/G9500 Jim Dandy Flat Top ricerca.jpg", "basswood", "noce", "42,9mm", "610mm", "esplosione di sole bicolore", 188, ChitarreAcustiche.FOLK);

		creaChitarraAcustica("CC-60SCE Nat WN", "Fender", "../../../assets/immagini_prodotti/chitarre_acustiche/folk/CC-60SCE Nat WN ricerca.jpg", "mogano", "noce", "43mm", "643mm", "naturale", 266, ChitarreAcustiche.FOLK);
	}
	
	public void creaOoooo() {
		creaChitarraAcustica("000-28 Brooke Ligertwood LH", "Martin Guitars", "../../../assets/immagini_prodotti/chitarre_acustiche/O-OO-OOO/000-28 Brooke Ligertwood ricerca.jpg", "abete", "ebano", "42,9mm", "645mm", "toner antico", 4555, ChitarreAcustiche.OOOOOO);

		creaChitarraAcustica("CLP-12SM BRS Solid Top", "Harley Benton", "../../../assets/immagini_prodotti/chitarre_acustiche/O-OO-OOO/CLP-12SM BRS Solid Top ricerca.jpg", "mogano", "cuore viola", "43mm", "628mm", "esplosione marone, lucido", 299, ChitarreAcustiche.OOOOOO);
	}

	public void creaRoundback() {
		creaChitarraAcustica("HBO-850 Classic Blue", "Harley Benton", "../../../assets/immagini_prodotti/chitarre_acustiche/roundback/HBO-850 Classic Blue ricerca.jpg", "abete", "roseacer", "43mm", "650mm", "blulucido", 129, ChitarreAcustiche.ROUNDBACK);

		creaChitarraAcustica("Celebrity Elite CE44-ABLKW-G", "Ovation", "../../../assets/immagini_prodotti/chitarre_acustiche/roundback/Celebrity Elite CE44-ABLKW-G ricerca.jpg", "blackwood", "ovangkol", "42,8mm", "643mm", "esplosione nera", 598, ChitarreAcustiche.ROUNDBACK);
	}

	public void creaDaViaggio() {
		creaChitarraAcustica("GS-Travel-E Spruce", "Harley Benton", "../../../assets/immagini_prodotti/chitarre_da_viaggio/GS-Travel-E Spruce ricerca.jpg", "abete rosso", "blackwood", "43mm", "596mm", "naturale lucido", 139, ChitarreAcustiche.DAVIAGGIO);
		
		creaChitarraAcustica("Swift Baby Taylor TS-BT", "Taylor", "../../../assets/immagini_prodotti/chitarre_da_viaggio/Swift Baby Taylor TS-BT ricerca.jpg", "abete", "ebano", "42,8mm", "578mm", "naturale, rosetta personalizzata", 379, ChitarreAcustiche.DAVIAGGIO);
	}
	
	public void crea08() {
		creaCorda("2225", "Ernie Ball", "008-011-014-022-030-038","acciaio nichelato", 6.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/008/2225 ricerca.jpg",TipoCorde.OTTO);
	
		creaCorda("EXL130", "Daddario", "008-011-014-022-030-038","acciaio nichelato", 7.40, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/008/EXL130 ricerca.jpg",TipoCorde.OTTO);
	}
	
	public void crea09() {
		creaCorda("2223", "Ernie Ball", "009-011-016-024-032-042","acciaio nichelato", 5.80, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/009/2223 ricerca.jpg",TipoCorde.NOVE);
	
		creaCorda("2222", "Ernie Ball", "009-011-016-026-036-046","acciaio nichelato", 5.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/009/2222 ricerca.jpg",TipoCorde.NOVE);	
	}
	
	public void crea10() {
		creaCorda("2221", "Ernie Ball", "010-013-017-026-036-046","acciaio nichelato", 5.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/010/2221 ricerca.jpg",TipoCorde.DIECI);
	
		creaCorda("2215", "Ernie Ball", "010-013-017-030-042-052","acciaio nichelato", 5.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/010/2215 ricerca.jpg",TipoCorde.DIECI);	
	}	
	
	public void crea11() {
		creaCorda("2220", "Ernie Ball", " 011-014-018-028-038-048","acciaio nichelato", 5.70, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/011/2220 ricerca.jpg",TipoCorde.UNDICI);
	
		creaCorda("2226", "Ernie Ball", "011-014-018-030-042-052","acciaio nichelato", 6.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_elettrica/011/2226 ricerca.jpg",TipoCorde.UNDICI);	
	}	
	
	public void creaStandard(){
		creaCorda("Valuestrings CL Normal", "Harley Benton", "normal","E,A,D argentate e avvolte, G,B,E nylon", 2.55, "../../../assets/immagini_prodotti/corde/corde_chitarra_classica/standard/Valuestrings CL Normal ricerca.jpg",TipoCorde.STANDARD);
		
		creaCorda("EJ45","Daddario", "028-032-040-029-035-043","rame argentato", 12.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_classica/standard/EJ45 ricerca.jpg",TipoCorde.STANDARD);	
	}
	
	public void creaCarbonio() {
		creaCorda("EJ45FF", "Daddario", "normal","carbonio", 16.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_classica/carbonio/EJ45FF ricerca.jpg",TipoCorde.CARBONIO);
		
		creaCorda("Strings Erithacus line EDC34.0 MHT", "Knobloch", "medium","corde alte carbonio, corde basse argento", 20.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_classica/carbonio/Strings Erithacus line EDC34.0 MHT ricerca.jpg",TipoCorde.CARBONIO);	
	}
	
	public void crea10Acustica() {
		creaCorda("MA-170 Authentic Acoustic Set", "Martin Guitars", "010-014-023-030-039-047","bronzo", 7.10, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/010/MA-170 Authentic Acoustic Set ricerca.jpg",TipoCorde.DIECIACUSTICHE);
		
		creaCorda("2008 Earthwood Bronze", "Ernie Ball", "010-013-017-030-042-052","bronzo", 7.40, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/010/2008 Earthwood Bronze ricerca.jpg",TipoCorde.DIECIACUSTICHE);		
	}
	
	public void crea11Acustica() {
		creaCorda("MA535T Authentic Treated", "Martin Guitars", "011-015-023-032-042-052","bronzo fosforoso", 14.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/011/MA535T Authentic Treated ricerca.jpg",TipoCorde.UNDICIACUSTICHE);
		
		creaCorda("HQS WE 11-52 PB", "Harley Benton", "011-015-022-032-042-052","bronzo fosforoso", 3.98, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/011/HQS WE 11-52 PB ricerca.jpg",TipoCorde.UNDICIACUSTICHE);	
	}

	public void crea12() {
		creaCorda("EJ16", "Daddario", "012-016-024-032-042-053","bronzo fosforoso", 11.40, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/012/EJ16 ricerca.jpg",TipoCorde.DODICI);
		
		creaCorda("Nanoweb Light-Medium Acoustic", "Elixir", "012-016-025-035-045-056","bronzo", 16.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/012/Nanoweb Light-Medium Acoustic ricerca.jpg",TipoCorde.DODICI);	
	}
	
	public void crea13() {
		creaCorda("MTR13 Tony Rice Sig.Strings", "Martin Guitars", "013-016-026-034-044-056","monel", 9.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/013/MTR13 Tony Rice Sig.Strings ricerca.jpg",TipoCorde.TREDICI);
		
		creaCorda("MEC-13", "Martin Guitars", "013-017-026-035-045-056","bronzo fosforoso", 6.80, "../../../assets/immagini_prodotti/corde/corde_chitarra_acustica/013/MEC-13 ricerca.jpg",TipoCorde.TREDICI);	
	}
	
	public void creaSteel() {
		creaCorda("PF500 E9", "GHS", "012-015-011-014-017-020-026-030-034-036","nichel", 12.40, "../../../assets/immagini_prodotti/corde/corde_chitarra_steel/PF500 E9 ricerca.jpg",TipoCorde.STEEL);
		
		creaCorda("Svenson´s Resophonic StringSet", "Pyramid", "016-019-028-039-049-059","bronzo fosforoso", 17.90, "../../../assets/immagini_prodotti/corde/corde_chitarra_steel/Svenson´s Resophonic StringSet ricerca.jpg",TipoCorde.STEEL);	
	}
	
	public void creaAcustici() {
		creaCorda("8060 Acoustic Bass", "Fender", "045-065-080-100","bronzo fosforoso", 20.40, "../../../assets/immagini_prodotti/corde/corde_basso_acustico/8060 Acoustic Bass ricerca.jpg",TipoCorde.ACUSTICI);
		
		creaCorda("IABS4C32 AcBassString Set", "Ibanez", "040-060-075-095","bronzo", 21.60, "../../../assets/immagini_prodotti/corde/corde_basso_acustico/IABS4C32 AcBassString Set ricerca.jpg",TipoCorde.ACUSTICI);	
	}
	
	public void crea40() {
		creaCorda("2835 Extra Slinky", "Ernie Ball", "040-060-070-095","nichel", 22.90, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/040/2835 Extra Slinky ricerca.jpg",TipoCorde.QUARANTA);
		
		creaCorda("2841 Hyper Slinky Bass", "Ernie Ball", "040-060-080-100","acciaio nichelato", 22.30, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/040/2841 Hyper Slinky Bass ricerca.jpg",TipoCorde.QUARANTA);	
	}
	
	public void crea45() {
		creaCorda("RS66LD Swing Bass", "Rotosound", "045-065-080-105","acciaio inossidabile", 22.30, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/045/RS66LD Swing Bass ricerca.jpg",TipoCorde.QUARANTACINQUE);
		
		creaCorda("2733", "Ernie Ball", "045-065-085-105","cobalto", 33.00, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/045/2733 ricerca.jpg",TipoCorde.QUARANTACINQUE);	
	}
	
	public void crea50() {
		creaCorda("3045 H Boomers", "GHS", "050-070-095-115","acciaio nichelato", 30, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/050/3045 H Boomers ricerca.jpg",TipoCorde.CINQUANTA);
		
		creaCorda("HQS Bass 50-110", "Harley Benton", "050-070-085-110","acciaio inossidabile", 9.90, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/050/HQS Bass 50-110 ricerca.jpg",TipoCorde.CINQUANTA);	
	}
	
	public void crea40cinque() {
		creaCorda("Strings Dragon Skin DSB5-40", "DR", "040-060-080-100-120","acciaio inossidabile", 49, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/040_5_corde/Strings Dragon Skin DSB5-40 ricerca.jpg",TipoCorde.QUARANTACINQUECORDE);
		
		creaCorda("Strings Pure Blues PB5-40", "DR", "040-060-080-100-120","quantum nichel", 50, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/040_5_corde/Strings Pure Blues PB5-40 ricerca.jpg",TipoCorde.QUARANTACINQUECORDE);	
	}
	
	public void crea45cinque() {
		creaCorda("Valuestrings Bass-5 45-130", "Harley Benton", "045-065-085-105-130","acciaio nichelato", 8.90, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/045_5_corde/Valuestrings Bass-5 45-130 ricerca.jpg",TipoCorde.QUARANTACINQUECINQUECORDE);
		
		creaCorda("EXL170-5", "Daddario", "045-065-085-105-130","nichel", 38, "../../../assets/immagini_prodotti/corde/corde_basso_elettrico/045_5_corde/EXL170-5 ricerca.jpg",TipoCorde.QUARANTACINQUECINQUECORDE);	
	}
	
}
