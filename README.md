# EcoQuestsBoost-ISetsAddon
EcoQuests plugin is required

This addon allows you to boost the amount of experience gained when players are completing quest tasks.

Using the below settings, the player will receive a 3x boost on the amount of task experience they earn. For instance, if they gained 10, they will receive 30.

```yaml
Boosts:
  - Namespace: ECO_QUESTS
    Type: Tasks
    Percent: false
    Settings:
      Boost_Amount: 3
```
