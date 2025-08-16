# Conversor de Monedas (USD ↔ ARS/BRL/COP) — Java + ExchangeRate-API

Aplicación de consola en **Java** que consulta tasas en tiempo real con **ExchangeRate-API** y convierte entre **USD** y **ARS/BRL/COP** en ambos sentidos.  
El menú pide la opción y luego el **monto**. La **URI del endpoint** cambia dinámicamente según la **moneda base** elegida.

---

## ✨ Características
- Menú simple por consola.
- Conversión **USD ↔ ARS**, **USD ↔ BRL**, **USD ↔ COP**.
- Llamada a `.../latest/<BASE>` usando **Gson** para deserializar.
- Salida formateada con `printf` (sin `Locale`/`NumberFormat`).

---

## 🧰 Requisitos
- **Java 17+** (se usan *records* y `HttpClient`).
- **Gson** para JSON.
- **API Key** de ExchangeRate-API.

---

## 🔑 Configuración de API Key
**Recomendado (variable de entorno):**
```bash
# Linux/macOS
export EXCHANGE_API_KEY="tu_api_key"
# Windows PowerShell
setx EXCHANGE_API_KEY "tu_api_key"
