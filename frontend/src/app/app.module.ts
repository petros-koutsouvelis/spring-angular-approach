import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import {RouterModule} from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CountriesLanguagesComponent } from './countries-languages/countries-languages.component';
import { CountryMetricsComponent } from './country-metrics/country-metrics.component';
import { WorldwideMetricsComponent } from './worldwide-metrics/worldwide-metrics.component';
import { LanguageDisplayComponent } from './language-display/language-display.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CountriesLanguagesComponent,
    CountryMetricsComponent,
    WorldwideMetricsComponent,
    LanguageDisplayComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
