import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
   
   //criei a minha variavel
   //3.1-menuOpened
   menuOpened=false;

   listTitles = [{
    trailer: '/assets/videos/trailer_guardioes_da_galaxia_1080p.mp4',
    cover: '/assets/images/guardios-da-galaxia.jpg',
    nome: 'Guardiões da Galaxia 1',
    relevancia: 98,
    age: 12,
    parts: 2,
    categories: ['Épico', 'Filme de fantasia', 'Viagem no espaço']
  },{
    trailer: '/assets/videos/trailer_guardioes_da_galaxia_1080p.mp4',
    cover: '/assets/images/guardios-da-galaxia.jpg',
    nome: 'Guardiões da Galaxia 2',
    relevancia: 80,
    age: 12,
    parts: 2,
    categories: ['épico', 'Filme de fantasia', 'Viagem no espaço']
    },{
    trailer: '/assets/videos/trailer_guardioes_da_galaxia_1080p.mp4',
    cover: '/assets/images/guardios-da-galaxia.jpg',
    nome: 'Guardiões da Galaxia 3',
    relevancia: 50,
    age: 0,
    parts: 2,
    categories: ['épico', 'Filme de fantasia', 'Viagem no espaço']
    },{
    trailer: '/assets/videos/trailer_guardioes_da_galaxia_1080p.mp4',
    cover: '/assets/images/guardios-da-galaxia.jpg',
    nome: 'Guardiões da Galaxia 4',
    relevancia: 50,
    age: 18,
    parts: 2,
    categories: ['épico', 'Filme de fantasia', 'Viagem no espaço']  
  }];

  // 3-Compnente PAI - (menuToggle)="setMenuState($Event)
setMenuState (state: boolean) {
  this.menuOpened = state;

}

  //4.1 - closeMenu
  closeMenu(){
    this.menuOpened = false; 
  }


}
