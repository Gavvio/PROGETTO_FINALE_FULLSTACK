import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './auth/signup/signup.component';
import { PrimaSceltaComponent } from './components/prima-scelta/prima-scelta.component';
import { SecondaSceltaComponent } from './components/seconda-scelta/seconda-scelta.component';
import { ArticlesComponent } from './components/articles/articles.component';

const routes: Routes = [{ path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule) },
{path:'',component:HomeComponent},
{path:'chitarre',component:PrimaSceltaComponent},
{path:'bassi',component:PrimaSceltaComponent},
{path:'batterie',component:PrimaSceltaComponent},
{path:'tastiere',component:PrimaSceltaComponent},
{path:'microfoni',component:PrimaSceltaComponent},
{path:'luci',component:PrimaSceltaComponent},
{path:'chitarre/chitarre_elettriche',component: SecondaSceltaComponent},
{path:'chitarre/chitarre_classiche',component: SecondaSceltaComponent},
{path:'chitarre/chitarre_acustiche',component: SecondaSceltaComponent},
{path:'chitarre/chitarre_da_viaggio',component: SecondaSceltaComponent},
{path:'chitarre/amplificatori_chitarre_elettriche',component: SecondaSceltaComponent},
{path:'chitarre/amplificatori_chitarre_acustiche',component: SecondaSceltaComponent},
{path:'chitarre/corde',component: SecondaSceltaComponent},
{path:'chitarre/effetti',component: SecondaSceltaComponent},
{path:'bassi/bassi_elettrici',component: SecondaSceltaComponent},
{path:'bassi/bassi_acustici',component: SecondaSceltaComponent},
{path:'bassi/amplificatori_bassi',component: SecondaSceltaComponent},
{path:'bassi/corde',component: SecondaSceltaComponent},
{path:'bassi/effetti',component: SecondaSceltaComponent},
{path:'batterie/batterie_acustiche',component: SecondaSceltaComponent},
{path:'batterie/batterie_elettroniche',component: SecondaSceltaComponent},
{path:'tastiere/tastiere',component: SecondaSceltaComponent},
{path:'tastiere/piani',component: SecondaSceltaComponent},
{path:'tastiere/piani_elettrici',component: SecondaSceltaComponent},
{path:'tastiere/pianoforti',component: SecondaSceltaComponent},
{path:'tastiere/amplificazione_tastiere',component: SecondaSceltaComponent},
{path:'microfoni/microfoni_a_nastro',component: SecondaSceltaComponent},
{path:'microfoni/microfoni_a_condensatore',component: SecondaSceltaComponent},
{path:'microfoni/microfoni_ad_archetto',component: SecondaSceltaComponent},
{path:'microfoni/microfoni_dinamici',component: SecondaSceltaComponent},
{path:'microfoni/microfoni_broadcast',component: SecondaSceltaComponent},
{path:'luci/luci_mobili',component: SecondaSceltaComponent},
{path:'luci/luci_teatrali',component: SecondaSceltaComponent},
{path:'luci/lasers',component: SecondaSceltaComponent},
{path:'luci/strobo',component: SecondaSceltaComponent},
{path:'chitarre/chitarre_elettriche/modelli_stratocaster',component: ArticlesComponent},
{path:'chitarre/chitarre_elettriche/modelli_telecaster',component: ArticlesComponent},
{path:'chitarre/chitarre_elettriche/modelli_single_cut',component: ArticlesComponent},
{path:'chitarre/chitarre_elettriche/modelli_double_cut',component: ArticlesComponent},
{path:'chitarre/chitarre_elettriche/chitarre_semiacustiche',component: ArticlesComponent},
{path:'chitarre/chitarre_elettriche/chitarre_heavy',component: ArticlesComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
