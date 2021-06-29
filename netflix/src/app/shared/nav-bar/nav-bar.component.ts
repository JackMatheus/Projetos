
import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';


    //Todo compoente precisa de um decorator//informa as carcteristicas deste componente//
    @Component({
        //app-nav-bar' aponta para o componente dentro do Html - qual o nome da tag que quero usar lá.
        selector: 'app-nav-bar',

        //Informo o template apontando para ./nav-bar.component.html
        templateUrl:'./nav-bar.component.html',

        //Informo o template apontando para ./nav-bar.component.html
        styleUrls:['./nav-bar.component.scss'],

    })


export class NavBarComponent implements OnInit{
    //Info do menu para o PAI
    //3-EventEmitter(boolean) é a tipagem, necessario do retorno da resposta
    @Output() menuToggle: EventEmitter<boolean> = new EventEmitter();
    
    //1.2 e 4.4- metodo e condicaçao
    @Input()opened=false;

     construtor(){ 
    }
     //OnInit vai ser chamado toda vez q o componente for inicializado
    ngOnInit(): void {    
    }

    //2.2 -metodo e condicao
    toggle(){
        // this.opened = ( this.opened === true) ? false : true;
        //opcao, susando javasccript(click),ou basta fazer a negação da variavel
        this.opened = !this.opened;
        //3.7- Disparando o evento trigger tru ou false  >> para o PAI
        this.menuToggle.emit(this.opened);

    }




}