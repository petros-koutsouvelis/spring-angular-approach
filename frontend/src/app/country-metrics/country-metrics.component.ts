import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-country-metrics',
  templateUrl: './country-metrics.component.html',
  styleUrl: './country-metrics.component.css'
})
export class CountryMetricsComponent implements OnInit {
  country_stats: any[] = [];


  constructor(private router: Router,private http: HttpClient) { }
  ngOnInit() {
    this.http.get<any[]>(`http://localhost:8080/api/stats`).subscribe((country_stats) => {
      this.country_stats = country_stats;})
  }

}
