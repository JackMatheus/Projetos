import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-titles',
  templateUrl: './list-titles.component.html',
  styleUrls: ['./list-titles.component.scss']
})
export class ListTitlesComponent implements OnInit {

 //Não importou o Input corretamente
  @Input() title!: string;

  // @Input() list = [];

  // @Input() list: string[] = [];
  @Input() list = [] as any;
  
  constructor() { }

  ngOnInit(): void {
  }

}
