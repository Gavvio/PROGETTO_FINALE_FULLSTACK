export interface User{
  name:string;
  accessToken:string;
  }

export interface PreferitiPayload{
  dtype:string;
  id: number;
  colore: string;
  lunghezza_scala: string;
  larghezza_scala: string;
  tastiera: string;
  manico: string;
  corpo: string;
  marca: string;
  modello: string;
  inlay: string;
  tasti: number;
  pickup: string;
  controlli: string;
  prezzo: number;
  immagine: string;
  tipoElettrica:string;
  tremolo:string;
}

export interface ChitarraElettrica {

  id: number;
  colore: string;
  lunghezza_scala: string;
  larghezza_scala: string;
  tastiera: string;
  manico: string;
  corpo: string;
  marca: string;
  modello: string;
  inlay: string;
  tasti: number;
  pickup: string;
  controlli: string;
  prezzo: number;
  immagine: string;
  tipoElettrica:string;
  tremolo:string;
}
