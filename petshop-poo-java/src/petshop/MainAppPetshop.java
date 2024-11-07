package petshop;





import javax.swing.JOptionPane;



/**
 *
 * @author danielmaciels
 */
public class MainAppPetshop extends javax.swing.JFrame {

    /**
     * MAIN
     */
    public MainAppPetshop() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(519, 938);
       
        
        
      
    }

    
    
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            tituloPetshop = new javax.swing.JLabel();
            nomesEquipe = new javax.swing.JLabel();
            confiraServicos = new javax.swing.JLabel();
                tituloToqueNosBotoes = new javax.swing.JLabel();

                tituloCaes = new javax.swing.JLabel();
                tituloProdutosCaes = new javax.swing.JLabel();
                    botaoRacaoCaes = new javax.swing.JButton();
                    botaoRoupasCaes = new javax.swing.JButton();
                    botaoBrinquedosCaes = new javax.swing.JButton();
                    botaoColeirasCaes = new javax.swing.JButton();
                    botaoPetiscosCaes = new javax.swing.JButton();
                    botaoAlimentacaoCaes = new javax.swing.JButton();
                        adocaoCaes = new javax.swing.JLabel();
                            botaoAdotarCaes = new javax.swing.JButton();
                            botaoParceiroCaes = new javax.swing.JButton();

                                jSeparator1 = new javax.swing.JSeparator();

                tituloGatos = new javax.swing.JLabel();
                tituloProdutosGatos = new javax.swing.JLabel();
                    botaoRacaoGatos = new javax.swing.JButton();
                    botaoRoupasGatos = new javax.swing.JButton();
                    botaoBrinquedosGatos = new javax.swing.JButton();
                    botaoColeirasGatos = new javax.swing.JButton();
                    botaoPetiscosGatos = new javax.swing.JButton();
                    botaoAlimentacaoGatos = new javax.swing.JButton();
                        adocaoGatos = new javax.swing.JLabel();
                            botaoAdotarGatos = new javax.swing.JButton();
                            botaoParceiroGatos = new javax.swing.JButton();

                                jSeparator2 = new javax.swing.JSeparator();

                tituloPeixes = new javax.swing.JLabel();
                tituloProdutosPeixes = new javax.swing.JLabel();
                    botaoRacaoPeixes = new javax.swing.JButton();
                    botaoBrinquedosPeixes = new javax.swing.JButton();
                    botaoPetiscosPeixes = new javax.swing.JButton();
                    botaoAlimentacaoPeixes = new javax.swing.JButton();
                        adocaoPeixes = new javax.swing.JLabel();
                            botaoAdotarPeixes = new javax.swing.JButton();
                            botaoParceiroPeixes = new javax.swing.JButton();

                                jSeparator3 = new javax.swing.JSeparator();
            
                tituloConsultas = new javax.swing.JLabel();
                    botaoEmergencia = new javax.swing.JButton();
                            botaoAgendarConsulta = new javax.swing.JButton();
                                
                                layoutPets = new javax.swing.JLabel();
             





                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Petshop");
                setBackground(new java.awt.Color(255, 255, 255));
                setSize(new java.awt.Dimension(519, 938));              

                    tituloPetshop.setFont(new java.awt.Font("Impact", 0, 82)); // NOI18N
                    tituloPetshop.setForeground(new java.awt.Color(255, 255, 255));
                    tituloPetshop.setText("PETSHOP");
                    getContentPane().add(tituloPetshop);
                    tituloPetshop.setBounds(110, 30, 287, 67);

                        botaoRoupasCaes.setBackground(new java.awt.Color(0, 204, 255));
                        botaoRoupasCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                        botaoRoupasCaes.setText("Roupas");
                        botaoRoupasCaes.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                            botaoRoupasCaesActionPerformed(evt);
                        }
                    });
                            getContentPane().add(botaoRoupasCaes);
                            botaoRoupasCaes.setBounds(260, 220, 97, 27);

                            botaoRacaoCaes.setBackground(new java.awt.Color(0, 204, 255));
                            botaoRacaoCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                            botaoRacaoCaes.setText("Ração");
                            botaoRacaoCaes.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoRacaoCaesActionPerformed(evt);
                            }
                        });
                            getContentPane().add(botaoRacaoCaes);
                            botaoRacaoCaes.setBounds(160, 220, 95, 27);

                            botaoBrinquedosCaes.setBackground(new java.awt.Color(51, 204, 255));
                            botaoBrinquedosCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                            botaoBrinquedosCaes.setText("Brinquedos");
                            botaoBrinquedosCaes.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoBrinquedosCaesActionPerformed(evt);
                                }
                            });
                                getContentPane().add(botaoBrinquedosCaes);
                                botaoBrinquedosCaes.setBounds(360, 220, 114, 27);

                                botaoColeirasCaes.setBackground(new java.awt.Color(0, 204, 255));
                                botaoColeirasCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                botaoColeirasCaes.setText("Coleiras");
                                botaoColeirasCaes.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    botaoColeirasCaesActionPerformed(evt);
                                }
                            });
                                    getContentPane().add(botaoColeirasCaes);
                                    botaoColeirasCaes.setBounds(160, 260, 95, 27);

                                    botaoPetiscosCaes.setBackground(new java.awt.Color(0, 204, 255));
                                    botaoPetiscosCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                    botaoPetiscosCaes.setText("Petiscos");
                                    botaoPetiscosCaes.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        botaoPetiscosCaesActionPerformed(evt);
                                    }
                                });
                                        getContentPane().add(botaoPetiscosCaes);
                                        botaoPetiscosCaes.setBounds(260, 260, 97, 27);

                                        tituloCaes.setFont(new java.awt.Font("Century Gothic", 3, 28)); // NOI18N
                                        tituloCaes.setForeground(new java.awt.Color(255, 255, 255));
                                        tituloCaes.setText("#CÃES");
                                        getContentPane().add(tituloCaes);
                                        tituloCaes.setBounds(90, 160, 90, 43);

                                            tituloProdutosCaes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
                                            tituloProdutosCaes.setForeground(new java.awt.Color(255, 255, 255));
                                            tituloProdutosCaes.setText("PRODUTOS:");
                                            getContentPane().add(tituloProdutosCaes);
                                            tituloProdutosCaes.setBounds(260, 190, 101, 23);

                                                botaoAlimentacaoCaes.setBackground(new java.awt.Color(0, 204, 255));
                                                botaoAlimentacaoCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                                botaoAlimentacaoCaes.setText("Alimentação");
                                                botaoAlimentacaoCaes.addActionListener(new java.awt.event.ActionListener() {
                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                    botaoAlimentacaoCaesActionPerformed(evt);
                                                    }
                                                });
                                                        getContentPane().add(botaoAlimentacaoCaes);
                                                        botaoAlimentacaoCaes.setBounds(360, 260, 114, 27);

                                                            confiraServicos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
                                                            confiraServicos.setForeground(new java.awt.Color(255, 255, 255));
                                                            confiraServicos.setText("Confira nossos serviços!");
                                                            getContentPane().add(confiraServicos);
                                                            confiraServicos.setBounds(110, 100, 284, 31);

                                                                adocaoGatos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
                                                                adocaoGatos.setForeground(new java.awt.Color(255, 255, 255));
                                                                adocaoGatos.setText("ADOÇÃO:");
                                                                getContentPane().add(adocaoGatos);
                                                                adocaoGatos.setBounds(140, 500, 95, 23);

                                                                    botaoAdotarGatos.setBackground(new java.awt.Color(255, 255, 0));
                                                                    botaoAdotarGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                                                    botaoAdotarGatos.setText("Adotar");
                                                                    botaoAdotarGatos.addActionListener(new java.awt.event.ActionListener() {
                                                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                        botaoAdotarGatosActionPerformed(evt);
                                                                        }
                                                                    });
                                                                getContentPane().add(botaoAdotarGatos);
                                                                botaoAdotarGatos.setBounds(240, 500, 97, 27);

                                                            botaoParceiroGatos.setBackground(new java.awt.Color(255, 255, 0));
                                                            botaoParceiroGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                                            botaoParceiroGatos.setText("Parceiro");
                                                            botaoParceiroGatos.addActionListener(new java.awt.event.ActionListener() {
                                                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                botaoParceiroGatosActionPerformed(evt);
                                                                }
                                                            });
                                                        getContentPane().add(botaoParceiroGatos);
                                                        botaoParceiroGatos.setBounds(340, 500, 97, 27);

                                                    botaoRoupasGatos.setBackground(new java.awt.Color(0, 204, 255));
                                                    botaoRoupasGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                                    botaoRoupasGatos.setText("Roupas");
                                                    botaoRoupasGatos.addActionListener(new java.awt.event.ActionListener() {
                                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                        botaoRoupasGatosActionPerformed(evt);
                                                        }
                                                    });
                                                getContentPane().add(botaoRoupasGatos);
                                                botaoRoupasGatos.setBounds(270, 400, 97, 27);

                                            botaoRacaoGatos.setBackground(new java.awt.Color(0, 204, 255));
                                            botaoRacaoGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                            botaoRacaoGatos.setText("Ração");
                                            botaoRacaoGatos.addActionListener(new java.awt.event.ActionListener() {
                                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                botaoRacaoGatosActionPerformed(evt);
                                                }
                                            });
                                        getContentPane().add(botaoRacaoGatos);
                                        botaoRacaoGatos.setBounds(170, 400, 97, 27);

                                    botaoBrinquedosGatos.setBackground(new java.awt.Color(0, 204, 255));
                                    botaoBrinquedosGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                    botaoBrinquedosGatos.setText("Brinquedos");
                                    botaoBrinquedosGatos.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        botaoBrinquedosGatosActionPerformed(evt);
                                        }
                                    });
                                getContentPane().add(botaoBrinquedosGatos);
                                botaoBrinquedosGatos.setBounds(370, 400, 114, 27);

                            botaoColeirasGatos.setBackground(new java.awt.Color(0, 204, 255));
                            botaoColeirasGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                            botaoColeirasGatos.setText("Coleiras");
                            botaoColeirasGatos.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoColeirasGatosActionPerformed(evt);
                                }
                            });
                        getContentPane().add(botaoColeirasGatos);
                        botaoColeirasGatos.setBounds(170, 440, 97, 27);

                    botaoPetiscosGatos.setBackground(new java.awt.Color(0, 204, 255));
                    botaoPetiscosGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    botaoPetiscosGatos.setText("Petiscos");
                    botaoPetiscosGatos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoPetiscosGatosActionPerformed(evt);
                    }
                });
                getContentPane().add(botaoPetiscosGatos);
                botaoPetiscosGatos.setBounds(270, 440, 97, 27);

            tituloGatos.setFont(new java.awt.Font("Century Gothic", 3, 28)); // NOI18N
            tituloGatos.setForeground(new java.awt.Color(255, 255, 255));
            tituloGatos.setText("#GATOS");
            getContentPane().add(tituloGatos);
            tituloGatos.setBounds(60, 360, 113, 43);

        tituloProdutosGatos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tituloProdutosGatos.setForeground(new java.awt.Color(255, 255, 255));
        tituloProdutosGatos.setText("PRODUTOS:");
        getContentPane().add(tituloProdutosGatos);
        tituloProdutosGatos.setBounds(270, 370, 101, 23);

    botaoAlimentacaoGatos.setBackground(new java.awt.Color(0, 204, 255));
    botaoAlimentacaoGatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    botaoAlimentacaoGatos.setText("Alimentação");
    botaoAlimentacaoGatos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoAlimentacaoGatosActionPerformed(evt);
        }
    });
        getContentPane().add(botaoAlimentacaoGatos);
        botaoAlimentacaoGatos.setBounds(370, 440, 114, 27);

            adocaoPeixes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
            adocaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
            adocaoPeixes.setText("ADOÇÃO:");
            getContentPane().add(adocaoPeixes);
            adocaoPeixes.setBounds(100, 680, 95, 23);

                botaoAdotarPeixes.setBackground(new java.awt.Color(255, 255, 0));
                botaoAdotarPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                botaoAdotarPeixes.setText("Adotar");
                botaoAdotarPeixes.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botaoAdotarPeixesActionPerformed(evt);
                    }
                });
                        getContentPane().add(botaoAdotarPeixes);
                        botaoAdotarPeixes.setBounds(200, 680, 114, 27);

                            botaoParceiroPeixes.setBackground(new java.awt.Color(255, 255, 0));
                            botaoParceiroPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                            botaoParceiroPeixes.setText("Parceiro");
                            botaoParceiroPeixes.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoParceiroPeixesActionPerformed(evt);
                                }
                            });
                                    getContentPane().add(botaoParceiroPeixes);
                                    botaoParceiroPeixes.setBounds(320, 680, 114, 27);

                                        botaoRacaoPeixes.setBackground(new java.awt.Color(0, 204, 255));
                                        botaoRacaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                        botaoRacaoPeixes.setText("Ração");
                                        botaoRacaoPeixes.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            botaoRacaoPeixesActionPerformed(evt);
                                            }
                                        });
                                                getContentPane().add(botaoRacaoPeixes);
                                                botaoRacaoPeixes.setBounds(200, 590, 114, 27);

                                                    botaoBrinquedosPeixes.setBackground(new java.awt.Color(0, 204, 255));
                                                    botaoBrinquedosPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                                    botaoBrinquedosPeixes.setText("Brinquedos");
                                                    botaoBrinquedosPeixes.addActionListener(new java.awt.event.ActionListener() {
                                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                        botaoBrinquedosPeixesActionPerformed(evt);
                                                        }
                                                    });
                                                            getContentPane().add(botaoBrinquedosPeixes);
                                                            botaoBrinquedosPeixes.setBounds(320, 590, 114, 27);

                                                                botaoPetiscosPeixes.setBackground(new java.awt.Color(0, 204, 255));
                                                                botaoPetiscosPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                                                botaoPetiscosPeixes.setText("Petiscos");
                                                                botaoPetiscosPeixes.addActionListener(new java.awt.event.ActionListener() {
                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                    botaoPetiscosPeixesActionPerformed(evt);
                                                                    }
                                                                });
                                                                        getContentPane().add(botaoPetiscosPeixes);
                                                                        botaoPetiscosPeixes.setBounds(200, 630, 114, 27);

                                                                    tituloPeixes.setFont(new java.awt.Font("Century Gothic", 3, 28)); // NOI18N
                                                                    tituloPeixes.setForeground(new java.awt.Color(255, 255, 255));
                                                                    tituloPeixes.setText("#PEIXES");
                                                                    getContentPane().add(tituloPeixes);
                                                                    tituloPeixes.setBounds(40, 560, 105, 43);

                                                                tituloProdutosPeixes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
                                                                tituloProdutosPeixes.setForeground(new java.awt.Color(255, 255, 255));
                                                                tituloProdutosPeixes.setText("PRODUTOS:");
                                                                getContentPane().add(tituloProdutosPeixes);
                                                                tituloProdutosPeixes.setBounds(270, 560, 101, 23);

                                                            botaoAlimentacaoPeixes.setBackground(new java.awt.Color(0, 204, 255));
                                                            botaoAlimentacaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                                            botaoAlimentacaoPeixes.setText("Alimentação");
                                                            botaoAlimentacaoPeixes.addActionListener(new java.awt.event.ActionListener() {
                                                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                botaoAlimentacaoPeixesActionPerformed(evt);
                                                                }
                                                            });
                                                        getContentPane().add(botaoAlimentacaoPeixes);
                                                        botaoAlimentacaoPeixes.setBounds(320, 630, 114, 27);

                                                    jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
                                                    jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
                                                    getContentPane().add(jSeparator1);
                                                    jSeparator1.setBounds(0, 350, 500, 16);

                                                jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
                                                jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
                                                getContentPane().add(jSeparator2);
                                                jSeparator2.setBounds(0, 540, 500, 16);

                                            adocaoCaes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
                                            adocaoCaes.setForeground(new java.awt.Color(255, 255, 255));
                                            adocaoCaes.setText("ADOÇÃO:");
                                            getContentPane().add(adocaoCaes);
                                            adocaoCaes.setBounds(120, 310, 95, 23);

                                        botaoAdotarCaes.setBackground(new java.awt.Color(255, 255, 0));
                                        botaoAdotarCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                        botaoAdotarCaes.setText("Adotar");
                                        botaoAdotarCaes.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            botaoAdotarCaesActionPerformed(evt);
                                            }
                                        });
                                    getContentPane().add(botaoAdotarCaes);
                                    botaoAdotarCaes.setBounds(230, 310, 95, 27);

                                botaoParceiroCaes.setBackground(new java.awt.Color(255, 255, 0));
                                botaoParceiroCaes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                                botaoParceiroCaes.setText("Parceiro");
                                botaoParceiroCaes.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    botaoParceiroCaesActionPerformed(evt);
                                    }
                                });
                            getContentPane().add(botaoParceiroCaes);
                            botaoParceiroCaes.setBounds(330, 310, 97, 27);

                        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
                        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
                        getContentPane().add(jSeparator3);
                        jSeparator3.setBounds(0, 720, 500, 10);

                    tituloConsultas.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
                    tituloConsultas.setForeground(new java.awt.Color(255, 255, 255));
                    tituloConsultas.setText("CONSULTAS");
                    getContentPane().add(tituloConsultas);
                    tituloConsultas.setBounds(150, 730, 204, 43);

                botaoEmergencia.setBackground(new java.awt.Color(255, 0, 0));
                botaoEmergencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                botaoEmergencia.setForeground(new java.awt.Color(255, 255, 255));
                botaoEmergencia.setText("EMERGÊNCIA");
                botaoEmergencia.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botaoEmergenciaActionPerformed(evt);
                    }
                });
            getContentPane().add(botaoEmergencia);
            botaoEmergencia.setBounds(40, 800, 154, 75);

        botaoAgendarConsulta.setBackground(new java.awt.Color(0, 255, 0));
        botaoAgendarConsulta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoAgendarConsulta.setText("AGENDAR");
        botaoAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendarConsultaActionPerformed(evt);
            }
        });
    getContentPane().add(botaoAgendarConsulta);
    botaoAgendarConsulta.setBounds(310, 800, 154, 75);

        tituloToqueNosBotoes.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        tituloToqueNosBotoes.setForeground(new java.awt.Color(255, 255, 255));
        tituloToqueNosBotoes.setText("*TOQUE NOS BOTÕES ABAIXO*");
        getContentPane().add(tituloToqueNosBotoes);
        tituloToqueNosBotoes.setBounds(230, 140, 244, 40);

            nomesEquipe.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
            nomesEquipe.setForeground(new java.awt.Color(0, 153, 255));
            nomesEquipe.setText("Daniel Maciel, Nicolas Ferreira, Simone Lima");
            getContentPane().add(nomesEquipe);
            nomesEquipe.setBounds(120, 0, 261, 16);

                layoutPets.setBackground(new java.awt.Color(255, 255, 255));
                layoutPets.setForeground(new java.awt.Color(255, 255, 255));
                layoutPets.setIcon(new javax.swing.ImageIcon("C:\\Users\\conta\\Downloads\\layout-api.png")); // NOI18N
                layoutPets.setText("jLabel2");
                getContentPane().add(layoutPets);
                layoutPets.setBounds(0, 0, 500, 900);

        pack();
            }// </editor-fold>                        

    
                    //titulo para lista de itens 
                    String tituloLista = "LISTA DE ITENS";
    
   
                        //produtos para cães
                        String [] racaoCaes = {
                            "Ração Pedigree: R$ 14,99.\n",
                            "Ração Whiskas: R$ 11,99.\n",
                            "Ração Golden Minibits: R$ 25,99.\n",
                            "Ração Dogchow Purina: R$ 19,99.\n",
                            "Ração Royal Canin Light: R$ 17,99.\n",
                            "Ração Quatree Life: R$ 32,99.\n",
                            "Ração Genérica: R$ 6,99.\n",
                        };     
                                String [] brinquedosCaes = {
                                    "Mordedor Galinha: R$ 9,99.\n",
                                    "Mordedor Osso: R$ 11,99.\n",
                                    "Disco voador: R$ 14,99.\n",
                                    "Bola com espinhos grande: R$ 8,99.\n",
                                };
                                        String [] coleirasCaes = {
                                            "Coleira nylon dupla fita: R$ 18,99.\n",
                                            "Coleira colete peitoral: R$ 18,99.\n",
                                            "Coleira retrátil: R$ 24,99.\n",
                                            "Coleira de guia: R$ 28,99.\n",
                                            "Pingente para Coleira: R$ 2,99.\n",
                                        };
                                                String [] roupasCaes = {
                                                    "Colete crochê: R$ 34,99.\n",
                                                    "Capa de chuva: R$ 28,99.\n",
                                                    "Colete cirúrgico: R$ 38,99.\n",
                                                    "Moletom algodão: R$ 42,99.\n",
                                                    "Óculos de sol: R$ 8,99.\n",
                                                };
                                                        String [] petiscosCaes = {
                                                            "Petisco Biscrok: R$ 11,99.",
                                                            "Petisco Whiskas Costela: R$ 16,99.\n",
                                                        };
                                                                String [] alimentacaoCaes = {
                                                                    "Salame Dudog: R$ 32,99.\n",
                                                                    "Salame Whiskas: R$ 26,99.\n",
                                                                };
    
                                                                    //produtos para gatos
                                                                    String [] racaoGatos = {
                                                                        "Ração Pedigree: R$ 9,99.\n",
                                                                        "Ração Whiskas: R$ 7,99.\n",
                                                                        "Ração Catchow Purina: R$ 13,99.\n",
                                                                        "Ração Genérica: R$ 5,99.\n",
                                                                    };      
                                                                String [] brinquedosGatos = {
                                                                    "Arranhador: R$ 9,99.\n",
                                                                    "Casinha para escalar: R$ 31,99.\n",
                                                                    "Laser de luz: R$ 1,99.",
                                                                };
                                                            String [] coleirasGatos = {
                                                                "Coleira peitoral: R$ 18,99.\n",
                                                                "Pingente para coleira: R$ 2,99.\n",
                                                                "Pingente Nike: R$ 19,99.\n",
                                                            };
                                                        String [] roupasGatos = {
                                                            "Chapéu algodão: R$ 18,99.\n",
                                                            "Vestido rosa: R$ 22,99.\n",
                                                        };
                                                    String [] petiscosGatos = {
                                                        "Petisco Biscrok: R$ 11,99.",
                                                        "Petisco sardinha: R$ 9,99.\n",          
                                                    };
                                                String [] alimentacaoGatos = {
                                                    "Grama natural: R$ 21,99.\n",
                                                    "Atum enlatado: R$ 16,99.\n",
                                                };
       
                                            //produtos para peixes
                                            String [] racaoPeixes = {
                                                "Ração Acquapex: R$ 9,99.\n",
                                                "Ração natural: R$ 7,99.\n",
                                                "Ração genérica: R$ 5,99.\n",
                                            };      
                                        String [] brinquedosPeixes = {
                                            "Túnel de pedra: R$ 19,99.\n",
                                            "Castelo de Atlântida: R$ 41,99.\n",
                                            "Coral colorido: R$ 31,99.",
                                        };
                                    String [] petiscosPeixes = {
                                        "Petisco Acquapex: R$ 8,99.",
                                        "Petisco de sementes: R$ 3,99.\n",          
                                    };
                                String [] alimentacaoPeixes = {
                                    "Alface natural: R$ 3,99.",
                                    "Plantas aquáticas: R$ 19,99.\n",
                                };

                            //pets para adoção
    
                            String [] caesAdocao = {
                                "Raça: Pinscher.\nIdade: 6 meses.\n\n",
                                "Raça: Salsicha.\nIdade: 3 meses.\n\n",
        "Raça: Pastor Alemão.\nIdade: 3 meses.\n",
    };
    
            String [] gatosAdocao = {
                "Raça: Minguado.\nIdade: 8 meses.\n\n",
                "Raça: Preto.\nIdade: 4 meses.\n\n",
                "Raça: Urbano.\nIdade: 5 meses.\n",
            };
    
                    String [] peixesAdocao = {
                        "Raça: Betta.\nIdade: 21 dias.\n\n",
                        "Raça: Palhaço.\nIdade: 17 dias.\n\n",
                        "Raça: Palhaço.\nIdade: 19 dias.\n",
                    };
       
                            private void botaoRacaoCaesActionPerformed(java.awt.event.ActionEvent evt) {                                               
                                JOptionPane.showMessageDialog(rootPane, racaoCaes, tituloLista, JOptionPane.CLOSED_OPTION);
      
                            }                                              

                                    private void botaoBrinquedosCaesActionPerformed(java.awt.event.ActionEvent evt) {                                                    
                                        JOptionPane.showMessageDialog(rootPane, brinquedosCaes, tituloLista, JOptionPane.CLOSED_OPTION);
       
                                    }                                                   

                                            private void botaoColeirasCaesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
                                                JOptionPane.showMessageDialog(rootPane, coleirasCaes, tituloLista, JOptionPane.CLOSED_OPTION);
       
                                            }                                                 

                                                    private void botaoRoupasCaesActionPerformed(java.awt.event.ActionEvent evt) {                                                
                                                        JOptionPane.showMessageDialog(rootPane, roupasCaes, tituloLista, JOptionPane.CLOSED_OPTION);
       
                                                    }                                               

                                                            private void botaoPetiscosCaesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
                                                                JOptionPane.showMessageDialog(rootPane, petiscosCaes, tituloLista, JOptionPane.CLOSED_OPTION);
       
                                                            }                                                 

                                                                    private void botaoAlimentacaoCaesActionPerformed(java.awt.event.ActionEvent evt) {                                                     
                                                                        JOptionPane.showMessageDialog(rootPane, alimentacaoCaes, tituloLista, JOptionPane.CLOSED_OPTION);
       
                                                                    }                                                    

                                                                        private void botaoRoupasGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                 
                                                                            JOptionPane.showMessageDialog(rootPane, roupasGatos, tituloLista, JOptionPane.CLOSED_OPTION);

                                                                        }                                                

                                                                    private void botaoRacaoGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                
                                                                        JOptionPane.showMessageDialog(rootPane, racaoGatos, tituloLista, JOptionPane.CLOSED_OPTION);
      
                                                                    }                                               

                                                                private void botaoBrinquedosGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                     
                                                                    JOptionPane.showMessageDialog(rootPane, brinquedosGatos,tituloLista, JOptionPane.CLOSED_OPTION);
      
                                                                }                                                    

                                                            private void botaoColeirasGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                   
                                                                JOptionPane.showMessageDialog(rootPane, coleirasGatos, tituloLista, JOptionPane.CLOSED_OPTION);
    
                                                            }                                                  

                                                        private void botaoPetiscosGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                   
                                                            JOptionPane.showMessageDialog(rootPane, petiscosGatos, tituloLista, JOptionPane.CLOSED_OPTION);


                                                        }                                                  

                                                    private void botaoAlimentacaoGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                      
                                                        JOptionPane.showMessageDialog(rootPane, alimentacaoGatos, tituloLista, JOptionPane.CLOSED_OPTION);

                                                    }                                                     

                                                private void botaoRacaoPeixesActionPerformed(java.awt.event.ActionEvent evt) {                                                 
                                                    JOptionPane.showMessageDialog(rootPane, racaoPeixes, tituloLista, JOptionPane.CLOSED_OPTION);

                                                }                                                

                                            private void botaoBrinquedosPeixesActionPerformed(java.awt.event.ActionEvent evt) {                                                      
                                                JOptionPane.showMessageDialog(rootPane, brinquedosPeixes, tituloLista, JOptionPane.CLOSED_OPTION);

                                            }                                                     

                                        private void botaoPetiscosPeixesActionPerformed(java.awt.event.ActionEvent evt) {                                                    
                                            JOptionPane.showMessageDialog(rootPane, petiscosPeixes, tituloLista, JOptionPane.CLOSED_OPTION);

                                        }                                                   

                                    private void botaoAlimentacaoPeixesActionPerformed(java.awt.event.ActionEvent evt) {                                                       
                                        JOptionPane.showMessageDialog(rootPane, alimentacaoPeixes, tituloLista, JOptionPane.CLOSED_OPTION);

                                    }                                                      

                                private void botaoAdotarPeixesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
                                    JOptionPane.showMessageDialog(rootPane, peixesAdocao, "ADOÇÃO DE PEIXES", JOptionPane.CLOSED_OPTION);
       
                                }                                                 

                            private void botaoParceiroPeixesActionPerformed(java.awt.event.ActionEvent evt) {                                                    
                                JOptionPane.showMessageDialog(rootPane, "Tem PEIXE para doar?\nEntre em contato conosco: 11 2222-3333.", "SEJA PARCEIRO!", JOptionPane.CLOSED_OPTION);

                            }                                                   

                        private void botaoAdotarGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                 
                            JOptionPane.showMessageDialog(rootPane, gatosAdocao, "ADOÇÃO DE GATOS", JOptionPane.CLOSED_OPTION);
      
                        }                                                

                    private void botaoParceiroGatosActionPerformed(java.awt.event.ActionEvent evt) {                                                   
                        JOptionPane.showMessageDialog(rootPane, "Tem GATO para doar?\nEntre em contato conosco: 11 2222-3333.", "SEJA PARCEIRO!", JOptionPane.CLOSED_OPTION);

                    }                                                  

                private void botaoAdotarCaesActionPerformed(java.awt.event.ActionEvent evt) {                                                
                    JOptionPane.showMessageDialog(rootPane, caesAdocao, "ADOÇÃO DE CÃES", JOptionPane.CLOSED_OPTION);
       
                }                                               

            private void botaoParceiroCaesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
                JOptionPane.showMessageDialog(rootPane, "Tem CÃO para doar?\nEntre em contato conosco: 11 2222-3333.", "SEJA PARCEIRO!", JOptionPane.CLOSED_OPTION);
        
            }                                                 

        private void botaoEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {                                                
            JOptionPane.showMessageDialog(rootPane, "LIGUE AGORA: 12 3456-7890.", "EMERGÊNCIA", JOptionPane.CLOSED_OPTION);

        }                                               

    private void botaoAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        JOptionPane.showMessageDialog(rootPane, "Agende uma consulta: 09 8765-4321.", "AGENDAR CONSULTA", JOptionPane.CLOSED_OPTION);

    }                                                    

    /**
     * @param args the command line arguments
     */
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
            */
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                         if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                                }
                            }
                                } catch (ClassNotFoundException ex) {
                                    java.util.logging.Logger.getLogger(MainAppPetshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                        } catch (InstantiationException ex) {
                                            java.util.logging.Logger.getLogger(MainAppPetshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                                } catch (IllegalAccessException ex) {
                                                    java.util.logging.Logger.getLogger(MainAppPetshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                                        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                                            java.util.logging.Logger.getLogger(MainAppPetshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                                        }
                                                            //</editor-fold>

                                                            /* Create and display the form */
                                                            java.awt.EventQueue.invokeLater(new Runnable() {
                                                                public void run() {
                                                                    new MainAppPetshop().setVisible(true);
                                                                                        }
                                                                                    });
                                                                            }

                                                        // Declaração de variáveis ​​- não modificar                  
                                                        private javax.swing.JLabel adocaoCaes;
                                                        private javax.swing.JLabel adocaoGatos;
                                                        private javax.swing.JLabel adocaoPeixes;
                                                        private javax.swing.JButton botaoAdotarCaes;
                                                        private javax.swing.JButton botaoAdotarGatos;
                                                        private javax.swing.JButton botaoAdotarPeixes;
                                                        private javax.swing.JButton botaoAgendarConsulta;
                                                        private javax.swing.JButton botaoAlimentacaoCaes;
                                                        private javax.swing.JButton botaoAlimentacaoGatos;
                                                        private javax.swing.JButton botaoAlimentacaoPeixes;
                                                        private javax.swing.JButton botaoBrinquedosCaes;
                                                        private javax.swing.JButton botaoBrinquedosGatos;
                                                        private javax.swing.JButton botaoBrinquedosPeixes;
                                                        private javax.swing.JButton botaoColeirasCaes;
                                                        private javax.swing.JButton botaoColeirasGatos;
                                                        private javax.swing.JButton botaoEmergencia;
                                                        private javax.swing.JButton botaoParceiroCaes;
                                                        private javax.swing.JButton botaoParceiroGatos;
                                                        private javax.swing.JButton botaoParceiroPeixes;
                                                        private javax.swing.JButton botaoPetiscosCaes;
                                                        private javax.swing.JButton botaoPetiscosGatos;
                                                        private javax.swing.JButton botaoPetiscosPeixes;
                                                        private javax.swing.JButton botaoRacaoCaes;
                                                        private javax.swing.JButton botaoRacaoGatos;
                                                        private javax.swing.JButton botaoRacaoPeixes;
                                                        private javax.swing.JButton botaoRoupasCaes;
                                                        private javax.swing.JButton botaoRoupasGatos;
                                                        private javax.swing.JLabel confiraServicos;
                                                        private javax.swing.JSeparator jSeparator1;
                                                        private javax.swing.JSeparator jSeparator2;
                                                        private javax.swing.JSeparator jSeparator3;
                                                        private javax.swing.JLabel layoutPets;
                                                        private javax.swing.JLabel nomesEquipe;
                                                        private javax.swing.JLabel tituloCaes;
                                                        private javax.swing.JLabel tituloConsultas;
                                                        private javax.swing.JLabel tituloGatos;
                                                        private javax.swing.JLabel tituloPeixes;
                                                        private javax.swing.JLabel tituloPetshop;
                                                        private javax.swing.JLabel tituloProdutosCaes;
                                                        private javax.swing.JLabel tituloProdutosGatos;
                                                        private javax.swing.JLabel tituloProdutosPeixes;
                                                        private javax.swing.JLabel tituloToqueNosBotoes;
                                                        // Fim da declaração de variáveis                
                                                    }