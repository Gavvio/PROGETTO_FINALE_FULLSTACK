import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './auth/login/login.component';
import { SignupComponent } from './auth/signup/signup.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PrimaSceltaComponent } from './components/prima-scelta/prima-scelta.component';
import { SecondaSceltaComponent } from './components/seconda-scelta/seconda-scelta.component';
import { ArticlesComponent } from './components/articles/articles.component';
import { TerzaSceltaComponent } from './components/terza-scelta/terza-scelta.component';
import { FooterComponent } from './components/footer/footer.component';
import { FavouritesComponent } from './components/favourites/favourites.component';
import { DetailsComponent } from './components/details/details.component';
import { CartComponent } from './components/cart/cart.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    LoginComponent,
    SignupComponent,
    PrimaSceltaComponent,
    SecondaSceltaComponent,
    ArticlesComponent,
    TerzaSceltaComponent,
    FooterComponent,
    FavouritesComponent,
    DetailsComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
