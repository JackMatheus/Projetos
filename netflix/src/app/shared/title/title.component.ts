import { Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.scss']
})
export class TitleComponent implements OnInit {
  
  // >>reenderizar a variável title para o template
  @Input() title: any;
  // 5v.2 - https://www.youtube.com/watch?v=hkIP4mElQic  t.19
  // 5v.2 - https://www.youtube.com/watch?v=hkIP4mElQic  t.19
  @ViewChild('trailer', { static: true })trailer!: ElementRef<HTMLVideoElement>;

  constructor() { }
  
  ngOnInit(): void {
  }
  // 5v.1 - eventos (mouseenter)="playVideo()" (mouseleave)="stopVideo()"
  playVideo(){
    
    this.trailer.nativeElement.play();
  }

  stopVideo(){
    
    this.trailer.nativeElement.currentTime=0;
    this.trailer.nativeElement.pause();
   
  }
 //5v.5 - eventos (muted)
  getMuted(): boolean {
    return this.trailer.nativeElement.muted;
  }

  //5v.7 -eventos (muted)
  toggleSound(){
    this.trailer.nativeElement.muted = !this.trailer.nativeElement.muted;
  }
}
