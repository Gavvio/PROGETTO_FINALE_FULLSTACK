import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './auth/signup/signup.component';
import { PrimaSceltaComponent } from './components/prima-scelta/prima-scelta.component';
import { SecondaSceltaComponent } from './components/seconda-scelta/seconda-scelta.component';
import { ArticlesComponent } from './components/articles/articles.component';
import { TerzaSceltaComponent } from './components/terza-scelta/terza-scelta.component';

const routes: Routes = [{ path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule) },
{ path: '', component: HomeComponent },
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
{ path: 'chitarre/amplificatori_chitarre_acustiche', component: ArticlesComponent},
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
//tastiere
{ path: 'tastiere/tastiere', component: SecondaSceltaComponent },
{ path: 'tastiere/piani', component: SecondaSceltaComponent },
{ path: 'tastiere/piani_elettrici', component: SecondaSceltaComponent },
{ path: 'tastiere/pianoforti', component: SecondaSceltaComponent },
{ path: 'tastiere/amplificazione_tastiere', component: SecondaSceltaComponent },
//microfoni
{ path: 'microfoni/microfoni_a_nastro', component: SecondaSceltaComponent },
{ path: 'microfoni/microfoni_a_condensatore', component: SecondaSceltaComponent },
{ path: 'microfoni/microfoni_ad_archetto', component: SecondaSceltaComponent },
{ path: 'microfoni/microfoni_dinamici', component: SecondaSceltaComponent },
{ path: 'microfoni/microfoni_broadcast', component: SecondaSceltaComponent },
//luci
{ path: 'luci/luci_mobili', component: SecondaSceltaComponent },
{ path: 'luci/luci_teatrali', component: SecondaSceltaComponent },
{ path: 'luci/lasers', component: SecondaSceltaComponent },
{ path: 'luci/strobo', component: SecondaSceltaComponent },
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
//amplificatori_chitarre/elettriche
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
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
