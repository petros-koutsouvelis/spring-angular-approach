import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-countries-languages',
  templateUrl: './countries-languages.component.html',
  styleUrl: './countries-languages.component.css'
})
@Injectable({
  providedIn: 'root'
})
export class CountriesLanguagesComponent implements OnInit {
  countries: any[] = [];


  constructor(private router: Router,private http: HttpClient) { }
  ngOnInit() {
    this.http.get<any[]>(`http://localhost:8080/api/countries`).subscribe((countries) => {
      this.countries = countries;})
  }

}