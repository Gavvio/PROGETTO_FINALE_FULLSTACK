import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './auth/signup/signup.component';
import { PrimaSceltaComponent } from './components/prima-scelta/prima-scelta.component';
import { SecondaSceltaComponent } from './components/seconda-scelta/seconda-scelta.component';
import { ArticlesComponent } from './components/articles/articles.component';
import { TerzaSceltaComponent } from './components/terza-scelta/terza-scelta.component';
import { FavouritesComponent } from './components/favourites/favourites.component';
import { DetailsComponent } from './components/details/details.component';
import { CartComponent } from './components/cart/cart.component';

const routes: Routes = [{ path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule) },
{ path: '', component: HomeComponent },
{ path: 'favourites', component: FavouritesComponent },
{ path: 'articolo/:id', component: DetailsComponent },
{ path: 'cart', component: CartComponent },
//categorie principali
{ path: 'chitarre', component: PrimaSceltaComponent },
{ path: 'bassi', component: PrimaSceltaComponent },
{ path: 'batterie', component: PrimaSceltaComponent },
{ path: 'tastiere', component: PrimaSceltaComponent },
{ path: 'microfoni', component: PrimaSceltaComponent },
{ path: 'luci', component: PrimaSceltaComponent },
//prime sottocategorie
//chitarre
{ path: 'chitarre/chitarre_elettriche', component: SecondaSceltaComponent },
{ path: 'chitarre/chitarre_classiche', component: SecondaSceltaComponent },
{ path: 'chitarre/chitarre_acustiche', component: SecondaSceltaComponent },
{ path: 'chitarre/chitarre_da_viaggio', component: ArticlesComponent },
{ path: 'chitarre/amplificatori_chitarre_elettriche', component: SecondaSceltaComponent },
{ path: 'chitarre/amplificatori_chitarre_acustiche', component: ArticlesComponent },
{ path: 'chitarre/corde', component: SecondaSceltaComponent },
{ path: 'chitarre/effetti', component: SecondaSceltaComponent },
//bassi
{ path: 'bassi/bassi_elettrici', component: SecondaSceltaComponent },
{ path: 'bassi/bassi_acustici', component: SecondaSceltaComponent },
{ path: 'bassi/amplificatori_bassi', component: SecondaSceltaComponent },
{ path: 'bassi/corde', component: SecondaSceltaComponent },
{ path: 'bassi/effetti', component: SecondaSceltaComponent },
//batterie
{ path: 'batterie/batterie_acustiche', component: SecondaSceltaComponent },
{ path: 'batterie/batterie_elettroniche', component: SecondaSceltaComponent },
{ path: 'batterie/bacchette', component: ArticlesComponent },
//tastiere
{ path: 'tastiere/tastiere', component: ArticlesComponent },
{ path: 'tastiere/piani', component: ArticlesComponent },
{ path: 'tastiere/piani_elettrici', component: ArticlesComponent },
{ path: 'tastiere/pianoforti', component: ArticlesComponent },
{ path: 'tastiere/amplificazione_tastiere', component: ArticlesComponent },
//microfoni
{ path: 'microfoni/microfoni_a_nastro', component: ArticlesComponent },
{ path: 'microfoni/microfoni_a_condensatore', component: ArticlesComponent },
{ path: 'microfoni/microfoni_ad_archetto', component: ArticlesComponent },
{ path: 'microfoni/microfoni_dinamici', component: ArticlesComponent },
{ path: 'microfoni/microfoni_broadcast', component: ArticlesComponent },
//luci
{ path: 'luci/luci_mobili', component: ArticlesComponent },
{ path: 'luci/luci_teatrali', component: ArticlesComponent },
{ path: 'luci/lasers', component: ArticlesComponent },
{ path: 'luci/strobo', component: ArticlesComponent },
//seconde sottocategorie
//chitarre elettriche
{ path: 'chitarre/chitarre_elettriche/stratocaster', component: ArticlesComponent },
{ path: 'chitarre/chitarre_elettriche/telecaster', component: ArticlesComponent },
{ path: 'chitarre/chitarre_elettriche/single_cut', component: ArticlesComponent },
{ path: 'chitarre/chitarre_elettriche/double_cut', component: ArticlesComponent },
{ path: 'chitarre/chitarre_elettriche/semiacustiche', component: ArticlesComponent },
{ path: 'chitarre/chitarre_elettriche/heavy', component: ArticlesComponent },
//chitarre classiche
{ path: 'chitarre/chitarre_classiche/1-8', component: ArticlesComponent },
{ path: 'chitarre/chitarre_classiche/1-4', component: ArticlesComponent },
{ path: 'chitarre/chitarre_classiche/1-2', component: ArticlesComponent },
{ path: 'chitarre/chitarre_classiche/3-4', component: ArticlesComponent },
{ path: 'chitarre/chitarre_classiche/7-8', component: ArticlesComponent },
{ path: 'chitarre/chitarre_classiche/4-4', component: ArticlesComponent },
//chitarre acustiche
{ path: 'chitarre/chitarre_acustiche/dreadnought', component: ArticlesComponent },
{ path: 'chitarre/chitarre_acustiche/jumbo', component: ArticlesComponent },
{ path: 'chitarre/chitarre_acustiche/folk', component: ArticlesComponent },
{ path: 'chitarre/chitarre_acustiche/O-OO-OOO', component: ArticlesComponent },
{ path: 'chitarre/chitarre_acustiche/roundback', component: ArticlesComponent },
//amplificatori_chitarre_elettriche
{ path: 'chitarre/amplificatori_chitarre_elettriche/combo', component: ArticlesComponent },
{ path: 'chitarre/amplificatori_chitarre_elettriche/testate', component: ArticlesComponent },
{ path: 'chitarre/amplificatori_chitarre_elettriche/cabinet_1-12', component: ArticlesComponent },
{ path: 'chitarre/amplificatori_chitarre_elettriche/cabinet_2-12', component: ArticlesComponent },
{ path: 'chitarre/amplificatori_chitarre_elettriche/cabinet_4-12', component: ArticlesComponent },
//corde chitarra
{ path: 'chitarre/corde/corde_elettrica', component: TerzaSceltaComponent },
{ path: 'chitarre/corde/corde_classica', component: TerzaSceltaComponent },
{ path: 'chitarre/corde/corde_acustica', component: TerzaSceltaComponent },
{ path: 'chitarre/corde/corde_steel', component: ArticlesComponent },
//effetti chitarra
{ path: 'chitarre/effetti/riverbero', component: ArticlesComponent },
{ path: 'chitarre/effetti/distorsione', component: ArticlesComponent },
{ path: 'chitarre/effetti/wahwah', component: ArticlesComponent },
{ path: 'chitarre/effetti/looper', component: ArticlesComponent },
{ path: 'chitarre/effetti/delay', component: ArticlesComponent },
{ path: 'chitarre/effetti/chorus', component: ArticlesComponent },
//bassi elettrici
{ path: 'bassi/bassi_elettrici/jazz_4_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_elettrici/jazz_5_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_elettrici/precision_4_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_elettrici/precision_5_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_elettrici/metal_4_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_elettrici/metal_5_corde', component: ArticlesComponent },
//bassi acustici
{ path: 'bassi/bassi_acustici/acustici_4_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_acustici/acustici_5_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_acustici/semi_acustici_4_corde', component: ArticlesComponent },
{ path: 'bassi/bassi_acustici/semi_acustici_5_corde', component: ArticlesComponent },
//amplificatori basso
{ path: 'bassi/amplificatori_bassi/combo', component: ArticlesComponent },
{ path: 'bassi/amplificatori_bassi/testate', component: ArticlesComponent },
{ path: 'bassi/amplificatori_bassi/cabinet_1x15', component: ArticlesComponent },
{ path: 'bassi/amplificatori_bassi/cabinet_2x10', component: ArticlesComponent },
{ path: 'bassi/amplificatori_bassi/cabinet_4x10', component: ArticlesComponent },
{ path: 'bassi/amplificatori_bassi/cabinet_8x10', component: ArticlesComponent },
//effetti basso
{ path: 'bassi/effetti/riverbero', component: ArticlesComponent },
{ path: 'bassi/effetti/distorsione', component: ArticlesComponent },
{ path: 'bassi/effetti/wahwah', component: ArticlesComponent },
{ path: 'bassi/effetti/looper', component: ArticlesComponent },
{ path: 'bassi/effetti/delay', component: ArticlesComponent },
{ path: 'bassi/effetti/chorus', component: ArticlesComponent },
//corde basso
{ path: 'bassi/corde/corde_basso_elettrico', component: TerzaSceltaComponent },
{ path: 'bassi/corde/corde_basso_acustico', component: ArticlesComponent },
//batterie acustiche
{ path: 'batterie/batterie_acustiche/rullanti', component: ArticlesComponent },
{ path: 'batterie/batterie_acustiche/timpani', component: ArticlesComponent },
{ path: 'batterie/batterie_acustiche/piatti', component: ArticlesComponent },
{ path: 'batterie/batterie_acustiche/toms', component: ArticlesComponent },
{ path: 'batterie/batterie_acustiche/grancasse', component: ArticlesComponent },
//batterie elettroniche
{ path: 'batterie/batterie_elettroniche/pad_rullanti', component: ArticlesComponent },
{ path: 'batterie/batterie_elettroniche/pad_piatti', component: ArticlesComponent },
{ path: 'batterie/batterie_elettroniche/pad_grancasse', component: ArticlesComponent },
{ path: 'batterie/batterie_elettroniche/pad_hi-hat', component: ArticlesComponent },
//terze sottocategorie
//corde chitarra elettrica
{ path: 'chitarre/corde/corde_elettrica/008', component: ArticlesComponent },
{ path: 'chitarre/corde/corde_elettrica/009', component: ArticlesComponent },
{ path: 'chitarre/corde/corde_elettrica/010', component: ArticlesComponent },
{ path: 'chitarre/corde/corde_elettrica/011', component: ArticlesComponent },
//corde chitarra acustica
{ path: 'chitarre/corde/corde_acustica/010', component: ArticlesComponent },
{ path: 'chitarre/corde/corde_acustica/011', component: ArticlesComponent },
{ path: 'chitarre/corde/corde_acustica/012', component: ArticlesComponent },
{ path: 'chitarre/corde/corde_acustica/013', component: ArticlesComponent },
//corde chitarra classica
{ path: 'chitarre/corde/corde_classica/standard', component: ArticlesComponent },
{ path: 'chitarre/corde/corde_classica/carbonio', component: ArticlesComponent },
//corde basso elettrico
{ path: 'bassi/corde/corde_basso_elettrico/040', component: ArticlesComponent },
{ path: 'bassi/corde/corde_basso_elettrico/045', component: ArticlesComponent },
{ path: 'bassi/corde/corde_basso_elettrico/050', component: ArticlesComponent },
{ path: 'bassi/corde/corde_basso_elettrico/040_5_corde', component: ArticlesComponent },
{ path: 'bassi/corde/corde_basso_elettrico/045_5_corde', component: ArticlesComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
