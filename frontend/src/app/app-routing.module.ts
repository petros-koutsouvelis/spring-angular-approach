import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CountriesLanguagesComponent } from './countries-languages/countries-languages.component';
import { CountryMetricsComponent } from './country-metrics/country-metrics.component';
import { WorldwideMetricsComponent } from './worldwide-metrics/worldwide-metrics.component';
import { LanguageDisplayComponent } from './language-display/language-display.component';

const routes: Routes = [
  {path:'', component:CountriesLanguagesComponent},
  {path:'countries & languages',component:CountriesLanguagesComponent},
  {path:'country metrics',component:CountryMetricsComponent},
  {path:'worldwide metrics',component:WorldwideMetricsComponent},
  {path:'language',component:LanguageDisplayComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
