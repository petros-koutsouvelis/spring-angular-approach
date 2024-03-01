import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-language-display',
  templateUrl: './language-display.component.html',
  styleUrl: './language-display.component.css'
})
export class LanguageDisplayComponent implements OnInit {
  languages: any[] = [];
  selectedCountry:string| null = null;
  selectedCountryId: string | null = null;

  constructor(private route: ActivatedRoute, private router: Router,private http: HttpClient) { }

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      this.selectedCountryId = params['id'];
      this.selectedCountry = params['name'];
      this.http.get<any[]>(`http://localhost:8080/api/countries/`+this.selectedCountryId+`/languages`).subscribe((languages) => {
        this.languages = languages;})
    });
    
  }
}
