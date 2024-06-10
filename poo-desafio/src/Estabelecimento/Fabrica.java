package Estabelecimento;

import Equipamento.Dispositivo.AparelhoEletronico;
import Equipamento.Musica.ReproduzirMusica;
import Equipamento.Navegador.NavegadorInternet;
import EquipamentoIphone.EquipamentoIphone;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoIphone iphone = new EquipamentoIphone();

        System.out.println("Musica");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        System.out.println(" ‴(⁰O⁰)‴ ");
        System.out.println(" ");

        System.out.println("Telefone");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println(" (✿◠‿◠) ");
        System.out.println(" ");

        System.out.println("Internet");
        iphone.pagina();
        iphone.adicionandoNovaPagina();
        iphone.atualizaPagina();
        System.out.println(" (. ❛ ᴗ ❛.)  ");
    }
}
