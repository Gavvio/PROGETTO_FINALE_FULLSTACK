package com.NegozioMusica.main.runners;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.services.ChitarraElettricaService;
import com.NegozioMusica.main.utils.ChitarreElettriche;


@Component
public class MainRunner implements ApplicationRunner {
	@Autowired
	ChitarraElettricaService elchitServ;

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

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("main runner on");
		
		// (String colore, String controlli, String corpo, String inlay, String
		// larghezza, String lunghezza, String manico, String pickup, int tasti, String
		// tastiera, double prezzo, String modello,ChitarreElettriche tipo,String marca, String tremolo
		// String immagine)
		
		// 10 HEAVY

//		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");
//
//		creaChitarraElettrica("rosso ferrari", "1 volume, 1 tono", "pioppo", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "2 Jackson high-output humbuckers", 24, "amaranto", 347, "JS32 Kelly Ferrari Red AH", ChitarreElettriche.HEAVY, "Jackson", "Floyd Rose licensed double locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/JS32 Kelly Ferrari Red AH ricerca.jpg");
//	
//		creaChitarraElettrica("viola trasparente", "1 volume, 1 tono", "ontano", "punti madreperla", "43mm", "648mm", "acero", "Seymour Duncan Trembucker(ponte) e humbucker Jazz (manico)", 24, "ebano", 8222, "Soloist SL2H QMT Purple USA", ChitarreElettriche.HEAVY, "Jackson", "Original Floyd Rose","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/Soloist SL2H QMT Purple USA ricerca.jpg");
//	
//		creaChitarraElettrica("rosso ferrari", "1 volume, 1 tono", "ontano selezionato", "punti blu laterali", "43mm", "648mm", "acero", "2 DiMarzio Occult Classic humbuckers", 24, "ebano", 8799, "Dave Davidson Warrior FR LTD", ChitarreElettriche.HEAVY, "Jackson", "Floyd Rose Original Double Locking 2-Point","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/Dave Davidson Warrior FR LTD ricerca.jpg");
//
		
		
		
//		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");
//
//		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");
//
//		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");
//
//		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");
//
//		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");
//
//		creaChitarraElettrica("nero, con smussatura gialla", "2 volume, 1 tono", "tiglio", "pinna di squalo perlati rovesciati", "42,8mm", "648mm", "acero", "humbucker Seymour Duncan AHB1BN (manico) e AHB-1B (ponte)", 24, "alloro", 798, "RRX24 Black with Yellow Bevels", ChitarreElettriche.HEAVY, "Jackson", "Sunken Floyd Rose special double-locking","../../../assets/immagini_prodotti/chitarre_elettriche/heavy/RRX24 Black with Yellow Bevels ricerca.jpg");
//

		
		
		//CREA ELETTRICHE
		
//		creaStratocasters();
//		creaTelecasters();
//		creaSingleCuts();
//		creaDoubleCuts();
//		creaSemiAcustiche();
//		creaHeavy();

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
		
	}
}
