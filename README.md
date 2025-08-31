# TodoList App

Este é um aplicativo **Android** desenvolvido em **Kotlin**, utilizando **Jetpack Compose** para interfaces e **ViewModel** para gerenciamento de estado. O projeto foi organizado seguindo boas práticas em camadas e mantém uma estrutura modular limpa.

---

##  Layout de referência

O design visual do app foi inspirado no layout criado pela comunidade no **Figma**, disponível em:

https://www.figma.com/design/ekDWILzUPh2DwPlnFCj7LM/TODO-Mobile-App--Community-?node-id=9-178&t=bdsXo8vu77MyFslY-0

---

##  Funcionalidades

- Adição de tarefas com título
- Listagem dinâmica das tarefas
- Marcar tarefas como concluídas
- Remover tarefas
- UI responsiva e estilizada com Material Design 3
- Estado gerenciado com `ViewModel` + `mutableStateListOf`

---

##  Estrutura do projeto

```bash
│
├── MainActivity.kt
├── data/
│ └── Tarefa.kt
├── viewmodel/
│ └── TarefaViewModel.kt
├── ui/
│ ├── components/
│ │ ├── Header.kt
│ │ ├── AddNewTask.kt
│ │ ├── ClockImage.kt
│ │ └── TaskItem.kt
│ └── screens/
│ └── TodoListScreen.kt
└── theme/
└── (arquivos de tema do Compose)
```

As camadas seguem o padrão:

- **data** – modelos e (futuramente) repositórios
- **viewmodel** – lógica de estado e interações
- **ui/components** – Composables reutilizáveis
- **ui/screens** – Telas compostas por componentes
- **theme** – Estilização do aplicativo

---

##  Como executar

1. **Clone** o repositório:

```bash
   git clone https://github.com/seu-usuario/todolist.git
   cd todolist
```

### Próximos passos (roadmap)

 Adicionar filtros (tarefas conclídas / pendentes)

 Persistir dados localmente com Room

 Implementar navegação com Navigation Compose

 Customizar temas (dark mode, cores dinâmicas)

 Refatorar com Clean Architecture (Repository, UseCase, DI, etc.)
