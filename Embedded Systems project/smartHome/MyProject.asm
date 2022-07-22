
_key_val:

;MyProject.c,25 :: 		char key_val()
;MyProject.c,27 :: 		portb=1;
	MOVLW      1
	MOVWF      PORTB+0
;MyProject.c,28 :: 		delay_ms(20);
	MOVLW      52
	MOVWF      R12+0
	MOVLW      241
	MOVWF      R13+0
L_key_val0:
	DECFSZ     R13+0, 1
	GOTO       L_key_val0
	DECFSZ     R12+0, 1
	GOTO       L_key_val0
	NOP
	NOP
;MyProject.c,29 :: 		if(portb.b4 == 1) return '1';
	BTFSS      PORTB+0, 4
	GOTO       L_key_val1
	MOVLW      49
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val1:
;MyProject.c,30 :: 		else if(portb.b5 == 1) return '2';
	BTFSS      PORTB+0, 5
	GOTO       L_key_val3
	MOVLW      50
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val3:
;MyProject.c,31 :: 		else if(portb.b6 == 1) return '3';
	BTFSS      PORTB+0, 6
	GOTO       L_key_val5
	MOVLW      51
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val5:
;MyProject.c,32 :: 		portb=2;
	MOVLW      2
	MOVWF      PORTB+0
;MyProject.c,33 :: 		delay_ms(20);
	MOVLW      52
	MOVWF      R12+0
	MOVLW      241
	MOVWF      R13+0
L_key_val6:
	DECFSZ     R13+0, 1
	GOTO       L_key_val6
	DECFSZ     R12+0, 1
	GOTO       L_key_val6
	NOP
	NOP
;MyProject.c,34 :: 		if(portb.b4 == 1) return '4';
	BTFSS      PORTB+0, 4
	GOTO       L_key_val7
	MOVLW      52
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val7:
;MyProject.c,35 :: 		else if(portb.b5 == 1) return '5';
	BTFSS      PORTB+0, 5
	GOTO       L_key_val9
	MOVLW      53
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val9:
;MyProject.c,36 :: 		else if(portb.b6 == 1) return '6';
	BTFSS      PORTB+0, 6
	GOTO       L_key_val11
	MOVLW      54
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val11:
;MyProject.c,37 :: 		portb=4;
	MOVLW      4
	MOVWF      PORTB+0
;MyProject.c,38 :: 		delay_ms(20);
	MOVLW      52
	MOVWF      R12+0
	MOVLW      241
	MOVWF      R13+0
L_key_val12:
	DECFSZ     R13+0, 1
	GOTO       L_key_val12
	DECFSZ     R12+0, 1
	GOTO       L_key_val12
	NOP
	NOP
;MyProject.c,39 :: 		if(portb.b4 == 1)  return '7';
	BTFSS      PORTB+0, 4
	GOTO       L_key_val13
	MOVLW      55
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val13:
;MyProject.c,40 :: 		else if(portb.b5 == 1)  return '8';
	BTFSS      PORTB+0, 5
	GOTO       L_key_val15
	MOVLW      56
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val15:
;MyProject.c,41 :: 		else if(portb.b6 == 1)  return '9';
	BTFSS      PORTB+0, 6
	GOTO       L_key_val17
	MOVLW      57
	MOVWF      R0+0
	GOTO       L_end_key_val
L_key_val17:
;MyProject.c,42 :: 		return '@';
	MOVLW      64
	MOVWF      R0+0
;MyProject.c,43 :: 		}
L_end_key_val:
	RETURN
; end of _key_val

_main:

;MyProject.c,45 :: 		void main() {
;MyProject.c,46 :: 		ANSELH = 0x00;  //configure PORTB as digital
	CLRF       ANSELH+0
;MyProject.c,47 :: 		ANSEL = 0x01;   //configure PORTA pin0 as analog
	MOVLW      1
	MOVWF      ANSEL+0
;MyProject.c,48 :: 		TRISB = 0xF0;
	MOVLW      240
	MOVWF      TRISB+0
;MyProject.c,49 :: 		TRISC = 0x00;
	CLRF       TRISC+0
;MyProject.c,50 :: 		TRISA = 0x01;
	MOVLW      1
	MOVWF      TRISA+0
;MyProject.c,51 :: 		portc =0;
	CLRF       PORTC+0
;MyProject.c,52 :: 		portb =0;
	CLRF       PORTB+0
;MyProject.c,53 :: 		PWM1_init(1000);
	BSF        T2CON+0, 0
	BSF        T2CON+0, 1
	MOVLW      124
	MOVWF      PR2+0
	CALL       _PWM1_Init+0
;MyProject.c,54 :: 		LCD_Init();
	CALL       _Lcd_Init+0
;MyProject.c,55 :: 		lcd_cmd(_lcd_clear);
	MOVLW      1
	MOVWF      FARG_Lcd_Cmd_out_char+0
	CALL       _Lcd_Cmd+0
;MyProject.c,56 :: 		lcd_cmd(_LCD_CURSOR_OFF);
	MOVLW      12
	MOVWF      FARG_Lcd_Cmd_out_char+0
	CALL       _Lcd_Cmd+0
;MyProject.c,57 :: 		delay_ms(10);
	MOVLW      26
	MOVWF      R12+0
	MOVLW      248
	MOVWF      R13+0
L_main18:
	DECFSZ     R13+0, 1
	GOTO       L_main18
	DECFSZ     R12+0, 1
	GOTO       L_main18
	NOP
;MyProject.c,58 :: 		lcd_out(1,1,"Enter pass: ");
	MOVLW      1
	MOVWF      FARG_Lcd_Out_row+0
	MOVLW      1
	MOVWF      FARG_Lcd_Out_column+0
	MOVLW      ?lstr1_MyProject+0
	MOVWF      FARG_Lcd_Out_text+0
	CALL       _Lcd_Out+0
;MyProject.c,60 :: 		for(i=0; i<4; i++)  eeprom_write(i,pass[i]);
	CLRF       _i+0
L_main19:
	MOVLW      4
	SUBWF      _i+0, 0
	BTFSC      STATUS+0, 0
	GOTO       L_main20
	MOVF       _i+0, 0
	MOVWF      FARG_EEPROM_Write_Address+0
	MOVF       _i+0, 0
	ADDLW      _pass+0
	MOVWF      FSR
	MOVF       INDF+0, 0
	MOVWF      FARG_EEPROM_Write_data_+0
	CALL       _EEPROM_Write+0
	INCF       _i+0, 1
	GOTO       L_main19
L_main20:
;MyProject.c,62 :: 		while(1)
L_main22:
;MyProject.c,65 :: 		sw_press = key_val();
	CALL       _key_val+0
	MOVF       R0+0, 0
	MOVWF      _sw_press+0
;MyProject.c,66 :: 		if(sw_press != '@')
	MOVF       R0+0, 0
	XORLW      64
	BTFSC      STATUS+0, 2
	GOTO       L_main24
;MyProject.c,68 :: 		check[x] = sw_press;
	MOVF       _x+0, 0
	ADDLW      _check+0
	MOVWF      FSR
	MOVF       _sw_press+0, 0
	MOVWF      INDF+0
;MyProject.c,69 :: 		lcd_chr(1,12+x,sw_press);
	MOVLW      1
	MOVWF      FARG_Lcd_Chr_row+0
	MOVF       _x+0, 0
	ADDLW      12
	MOVWF      FARG_Lcd_Chr_column+0
	MOVF       _sw_press+0, 0
	MOVWF      FARG_Lcd_Chr_out_char+0
	CALL       _Lcd_Chr+0
;MyProject.c,70 :: 		x++;
	INCF       _x+0, 1
;MyProject.c,71 :: 		if(x>3)
	MOVF       _x+0, 0
	SUBLW      3
	BTFSC      STATUS+0, 0
	GOTO       L_main25
;MyProject.c,73 :: 		passwordValid =1;
	MOVLW      1
	MOVWF      _passwordValid+0
;MyProject.c,74 :: 		for(i=0; i<4; i++) if(check[i] != eeprom_read(i)) passwordValid = 0;
	CLRF       _i+0
L_main26:
	MOVLW      4
	SUBWF      _i+0, 0
	BTFSC      STATUS+0, 0
	GOTO       L_main27
	MOVF       _i+0, 0
	ADDLW      _check+0
	MOVWF      FSR
	MOVF       INDF+0, 0
	MOVWF      FLOC__main+0
	MOVF       _i+0, 0
	MOVWF      FARG_EEPROM_Read_Address+0
	CALL       _EEPROM_Read+0
	MOVF       FLOC__main+0, 0
	XORWF      R0+0, 0
	BTFSC      STATUS+0, 2
	GOTO       L_main29
	CLRF       _passwordValid+0
L_main29:
	INCF       _i+0, 1
	GOTO       L_main26
L_main27:
;MyProject.c,76 :: 		if(passwordValid){
	MOVF       _passwordValid+0, 0
	BTFSC      STATUS+0, 2
	GOTO       L_main30
;MyProject.c,77 :: 		lcd_cmd(_lcd_clear);
	MOVLW      1
	MOVWF      FARG_Lcd_Cmd_out_char+0
	CALL       _Lcd_Cmd+0
;MyProject.c,78 :: 		lcd_out(1,1,"WLECOME");
	MOVLW      1
	MOVWF      FARG_Lcd_Out_row+0
	MOVLW      1
	MOVWF      FARG_Lcd_Out_column+0
	MOVLW      ?lstr2_MyProject+0
	MOVWF      FARG_Lcd_Out_text+0
	CALL       _Lcd_Out+0
;MyProject.c,79 :: 		portc.b6 = 1; //green led on
	BSF        PORTC+0, 6
;MyProject.c,80 :: 		portc.b3 = 1;  //door motor turns clockwise to open
	BSF        PORTC+0, 3
;MyProject.c,81 :: 		delay_ms(500);
	MOVLW      6
	MOVWF      R11+0
	MOVLW      19
	MOVWF      R12+0
	MOVLW      173
	MOVWF      R13+0
L_main31:
	DECFSZ     R13+0, 1
	GOTO       L_main31
	DECFSZ     R12+0, 1
	GOTO       L_main31
	DECFSZ     R11+0, 1
	GOTO       L_main31
	NOP
	NOP
;MyProject.c,82 :: 		portc.b3 = 0;   //stop door motor to enter home
	BCF        PORTC+0, 3
;MyProject.c,83 :: 		delay_ms(500);
	MOVLW      6
	MOVWF      R11+0
	MOVLW      19
	MOVWF      R12+0
	MOVLW      173
	MOVWF      R13+0
L_main32:
	DECFSZ     R13+0, 1
	GOTO       L_main32
	DECFSZ     R12+0, 1
	GOTO       L_main32
	DECFSZ     R11+0, 1
	GOTO       L_main32
	NOP
	NOP
;MyProject.c,84 :: 		portc.b4 = 1;  //door motor turns counter clockwise to close
	BSF        PORTC+0, 4
;MyProject.c,85 :: 		delay_ms(500);
	MOVLW      6
	MOVWF      R11+0
	MOVLW      19
	MOVWF      R12+0
	MOVLW      173
	MOVWF      R13+0
L_main33:
	DECFSZ     R13+0, 1
	GOTO       L_main33
	DECFSZ     R12+0, 1
	GOTO       L_main33
	DECFSZ     R11+0, 1
	GOTO       L_main33
	NOP
	NOP
;MyProject.c,86 :: 		portc.b4 = 0; //stop door motor
	BCF        PORTC+0, 4
;MyProject.c,87 :: 		portc.b6 = 0; //turn off green led
	BCF        PORTC+0, 6
;MyProject.c,88 :: 		lcd_cmd(_lcd_clear);
	MOVLW      1
	MOVWF      FARG_Lcd_Cmd_out_char+0
	CALL       _Lcd_Cmd+0
;MyProject.c,89 :: 		lcd_out(1,1,"Enter pass: ");
	MOVLW      1
	MOVWF      FARG_Lcd_Out_row+0
	MOVLW      1
	MOVWF      FARG_Lcd_Out_column+0
	MOVLW      ?lstr3_MyProject+0
	MOVWF      FARG_Lcd_Out_text+0
	CALL       _Lcd_Out+0
;MyProject.c,90 :: 		}else{
	GOTO       L_main34
L_main30:
;MyProject.c,91 :: 		portc.b5 = 1; //red led on
	BSF        PORTC+0, 5
;MyProject.c,92 :: 		lcd_cmd(_lcd_clear);
	MOVLW      1
	MOVWF      FARG_Lcd_Cmd_out_char+0
	CALL       _Lcd_Cmd+0
;MyProject.c,93 :: 		lcd_out(1,1,"WORNG PASSWROD!");
	MOVLW      1
	MOVWF      FARG_Lcd_Out_row+0
	MOVLW      1
	MOVWF      FARG_Lcd_Out_column+0
	MOVLW      ?lstr4_MyProject+0
	MOVWF      FARG_Lcd_Out_text+0
	CALL       _Lcd_Out+0
;MyProject.c,94 :: 		delay_ms(500);
	MOVLW      6
	MOVWF      R11+0
	MOVLW      19
	MOVWF      R12+0
	MOVLW      173
	MOVWF      R13+0
L_main35:
	DECFSZ     R13+0, 1
	GOTO       L_main35
	DECFSZ     R12+0, 1
	GOTO       L_main35
	DECFSZ     R11+0, 1
	GOTO       L_main35
	NOP
	NOP
;MyProject.c,95 :: 		portc.b5 = 0; //turn off red led
	BCF        PORTC+0, 5
;MyProject.c,96 :: 		lcd_cmd(_lcd_clear);
	MOVLW      1
	MOVWF      FARG_Lcd_Cmd_out_char+0
	CALL       _Lcd_Cmd+0
;MyProject.c,97 :: 		lcd_out(1,1,"Enter pass: ");
	MOVLW      1
	MOVWF      FARG_Lcd_Out_row+0
	MOVLW      1
	MOVWF      FARG_Lcd_Out_column+0
	MOVLW      ?lstr5_MyProject+0
	MOVWF      FARG_Lcd_Out_text+0
	CALL       _Lcd_Out+0
;MyProject.c,98 :: 		}
L_main34:
;MyProject.c,99 :: 		x=0;
	CLRF       _x+0
;MyProject.c,100 :: 		}
L_main25:
;MyProject.c,101 :: 		}
L_main24:
;MyProject.c,102 :: 		sw_press = '@';
	MOVLW      64
	MOVWF      _sw_press+0
;MyProject.c,104 :: 		buffer = ADC_read(0);
	CLRF       FARG_ADC_Read_channel+0
	CALL       _ADC_Read+0
	MOVF       R0+0, 0
	MOVWF      _buffer+0
	MOVF       R0+1, 0
	MOVWF      _buffer+1
;MyProject.c,105 :: 		volt = buffer*4.88;
	CALL       _word2double+0
	MOVLW      246
	MOVWF      R4+0
	MOVLW      40
	MOVWF      R4+1
	MOVLW      28
	MOVWF      R4+2
	MOVLW      129
	MOVWF      R4+3
	CALL       _Mul_32x32_FP+0
	MOVF       R0+0, 0
	MOVWF      _volt+0
	MOVF       R0+1, 0
	MOVWF      _volt+1
	MOVF       R0+2, 0
	MOVWF      _volt+2
	MOVF       R0+3, 0
	MOVWF      _volt+3
;MyProject.c,106 :: 		temp = volt/10.0;
	MOVLW      0
	MOVWF      R4+0
	MOVLW      0
	MOVWF      R4+1
	MOVLW      32
	MOVWF      R4+2
	MOVLW      130
	MOVWF      R4+3
	CALL       _Div_32x32_FP+0
	CALL       _double2int+0
	MOVF       R0+0, 0
	MOVWF      _temp+0
	MOVF       R0+1, 0
	MOVWF      _temp+1
;MyProject.c,107 :: 		IntToStr(temp,text);
	MOVF       R0+0, 0
	MOVWF      FARG_IntToStr_input+0
	MOVF       R0+1, 0
	MOVWF      FARG_IntToStr_input+1
	MOVLW      _text+0
	MOVWF      FARG_IntToStr_output+0
	CALL       _IntToStr+0
;MyProject.c,108 :: 		LCD_OUT(2,1,"Temp= ");
	MOVLW      2
	MOVWF      FARG_Lcd_Out_row+0
	MOVLW      1
	MOVWF      FARG_Lcd_Out_column+0
	MOVLW      ?lstr6_MyProject+0
	MOVWF      FARG_Lcd_Out_text+0
	CALL       _Lcd_Out+0
;MyProject.c,109 :: 		LCD_OUT_CP(text);
	MOVLW      _text+0
	MOVWF      FARG_Lcd_Out_CP_text+0
	CALL       _Lcd_Out_CP+0
;MyProject.c,110 :: 		LCD_Chr_CP(' ');
	MOVLW      32
	MOVWF      FARG_Lcd_Chr_CP_out_char+0
	CALL       _Lcd_Chr_CP+0
;MyProject.c,111 :: 		LCD_Chr_CP('C');
	MOVLW      67
	MOVWF      FARG_Lcd_Chr_CP_out_char+0
	CALL       _Lcd_Chr_CP+0
;MyProject.c,113 :: 		if(temp>=30 && temp<32)
	MOVLW      128
	XORWF      _temp+1, 0
	MOVWF      R0+0
	MOVLW      128
	SUBWF      R0+0, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main52
	MOVLW      30
	SUBWF      _temp+0, 0
L__main52:
	BTFSS      STATUS+0, 0
	GOTO       L_main38
	MOVLW      128
	XORWF      _temp+1, 0
	MOVWF      R0+0
	MOVLW      128
	SUBWF      R0+0, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main53
	MOVLW      32
	SUBWF      _temp+0, 0
L__main53:
	BTFSC      STATUS+0, 0
	GOTO       L_main38
L__main49:
;MyProject.c,115 :: 		PWM1_stop();
	CALL       _PWM1_Stop+0
;MyProject.c,116 :: 		PWM1_set_duty(204); //speed of fan is 80%
	MOVLW      204
	MOVWF      FARG_PWM1_Set_Duty_new_duty+0
	CALL       _PWM1_Set_Duty+0
;MyProject.c,117 :: 		PORTC.b1=0;
	BCF        PORTC+0, 1
;MyProject.c,118 :: 		}
	GOTO       L_main39
L_main38:
;MyProject.c,119 :: 		else if(temp>=32 && temp<34)
	MOVLW      128
	XORWF      _temp+1, 0
	MOVWF      R0+0
	MOVLW      128
	SUBWF      R0+0, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main54
	MOVLW      32
	SUBWF      _temp+0, 0
L__main54:
	BTFSS      STATUS+0, 0
	GOTO       L_main42
	MOVLW      128
	XORWF      _temp+1, 0
	MOVWF      R0+0
	MOVLW      128
	SUBWF      R0+0, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main55
	MOVLW      34
	SUBWF      _temp+0, 0
L__main55:
	BTFSC      STATUS+0, 0
	GOTO       L_main42
L__main48:
;MyProject.c,121 :: 		PWM1_stop();
	CALL       _PWM1_Stop+0
;MyProject.c,122 :: 		PWM1_set_duty(230); //speed of fan is 90%
	MOVLW      230
	MOVWF      FARG_PWM1_Set_Duty_new_duty+0
	CALL       _PWM1_Set_Duty+0
;MyProject.c,123 :: 		PORTC.b1=0;
	BCF        PORTC+0, 1
;MyProject.c,124 :: 		}
	GOTO       L_main43
L_main42:
;MyProject.c,125 :: 		else if(temp>=34)
	MOVLW      128
	XORWF      _temp+1, 0
	MOVWF      R0+0
	MOVLW      128
	SUBWF      R0+0, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main56
	MOVLW      34
	SUBWF      _temp+0, 0
L__main56:
	BTFSS      STATUS+0, 0
	GOTO       L_main44
;MyProject.c,127 :: 		PWM1_stop();
	CALL       _PWM1_Stop+0
;MyProject.c,128 :: 		PWM1_set_duty(255); //speed of fan is 100%
	MOVLW      255
	MOVWF      FARG_PWM1_Set_Duty_new_duty+0
	CALL       _PWM1_Set_Duty+0
;MyProject.c,129 :: 		PORTC.b1=0;
	BCF        PORTC+0, 1
;MyProject.c,130 :: 		}
	GOTO       L_main45
L_main44:
;MyProject.c,131 :: 		else if(temp<30)
	MOVLW      128
	XORWF      _temp+1, 0
	MOVWF      R0+0
	MOVLW      128
	SUBWF      R0+0, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main57
	MOVLW      30
	SUBWF      _temp+0, 0
L__main57:
	BTFSC      STATUS+0, 0
	GOTO       L_main46
;MyProject.c,133 :: 		PWM1_stop();
	CALL       _PWM1_Stop+0
;MyProject.c,134 :: 		PWM1_set_duty(0);  //turn off fan
	CLRF       FARG_PWM1_Set_Duty_new_duty+0
	CALL       _PWM1_Set_Duty+0
;MyProject.c,135 :: 		PORTC.b1=1;  //turn on heater.
	BSF        PORTC+0, 1
;MyProject.c,136 :: 		}
L_main46:
L_main45:
L_main43:
L_main39:
;MyProject.c,137 :: 		delay_ms(10);
	MOVLW      26
	MOVWF      R12+0
	MOVLW      248
	MOVWF      R13+0
L_main47:
	DECFSZ     R13+0, 1
	GOTO       L_main47
	DECFSZ     R12+0, 1
	GOTO       L_main47
	NOP
;MyProject.c,138 :: 		PWM1_start();
	CALL       _PWM1_Start+0
;MyProject.c,139 :: 		}
	GOTO       L_main22
;MyProject.c,140 :: 		}
L_end_main:
	GOTO       $+0
; end of _main
