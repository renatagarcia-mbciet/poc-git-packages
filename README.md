# poc-git-packages

## Application
Com os pacotes do GitHub, você pode publicar e consumir pacotes com segurança em sua organização.

```

```
## Esteira CD/CI
[![actions-tests](https://github.com/renatagarcia-mbciet/poc-git-packages/actions/workflows/build.yml/badge.svg)](https://github.com/renatagarcia-mbciet/poc-git-packages/actions/workflows/build.yml)

[![actions-tests](https://github.com/renatagarcia-mbciet/poc-git-packages/actions/workflows/tests.yml/badge.svg)](https://github.com/renatagarcia-mbciet/poc-git-packages/actions/workflows/tests.yml)

[![actions-tests](https://github.com/renatagarcia-mbciet/poc-git-packages/actions/workflows/publish.yml/badge.svg)](https://github.com/renatagarcia-mbciet/poc-git-packages/actions/workflows/publish.yml)

```


```
## Requisitos
### Alterar arquivo settings.xml
Alterar o arquivo settings do maven apontando o servidor github para utilizar a sua lib versionada.
```bash
    <profiles>
        <profile>
            <id>github</id>
            <repositories>
		<repository>
                    <id>central</id>
                    <url>https://repo1.maven.org/maven2</url>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                </repository>
                <repository>
                    <id>github</id>
                    <url>https://maven.pkg.github.com/renatagarcia-mbciet/poc-git-packages/</url>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
            </repositories>
        </profile>
    </profiles>
```

## Referência
Link Documentação
```bash
https://github.com/features/packages
```