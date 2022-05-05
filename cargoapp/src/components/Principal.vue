<template>
  <v-app id="inspire">
    <v-navigation-drawer v-model="drawer" app color="#f1f1f1">
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title class="text-h6"> CARGOAPP </v-list-item-title>
          <v-list-item-subtitle>
            Sistema Gerencial para transportadoras
          </v-list-item-subtitle>
        </v-list-item-content>
      </v-list-item>

      <v-divider></v-divider>

      <v-list dense nav>
       
        <v-list-item v-for="item in items" :key="item.title" :to="item.to" link>
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>

          <v-list-item-content>
            <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item-content>
          
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
    <v-app-bar app color="#f1f1f1">
      <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>

      <v-app-bar-title
        >
     </v-app-bar-title>

      <v-spacer></v-spacer>
   
    </v-app-bar>

   

    <div class="footer">
      <h2 class="text-footer">
        CARGOAPP - SISTEMA GERENCIAL PARA TRANSPORTADORAS
      </h2>
    </div>
  </v-app>
</template>

<script>

export default {
    
  data: () => ({
    drawer: null,
    items: [
      { title: "CARGAS", icon: "mdi-view-dashboard", to: "/carga" },
      { title: "CARROS", icon: "mdi-car"},
      { title: "OPERAÇÕES", icon: "mdi-badge-account"},
      { title: "PESSOAS FÍSICAS", icon: "mdi-account-tie"},
      { title: "PESSOAS JURÍDICAS", icon: "mdi-account-tie"},
  
      

      
    ],
  }),
};
</script>

<style scoped>
.footer {
  position: fixed;
  margin: 0;
  padding: 0;
  border: 0;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: #7e393b;
  color: white;
  text-align: center;
  font-family: Roboto, sans-serif;
  font-size: 9px;
}
.text-footer {
  padding: 12px;
}
.logo-itpac {
  padding-top: 2.2%;
  width: 17%;
  height: 17%;
}
.sair {
  width: 50px;
  height: 24px;
}
</style>









