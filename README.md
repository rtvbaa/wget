# wget
Консольная утилита для скачивания файлов по HTTP протоколу.

Входные параметры:

-n количество одновременно качающих потоков (1,2,3,4....)
-l общее ограничение на скорость скачивания, для всех потоков, размерность - байт/секунда, можно использовать суффиксы k,m (k=1024, m=1024*1024)
-f путь к файлу со списком ссылок
-o имя папки, куда складывать скачанные файлы
Формат файла со ссылками:

<HTTP ссылка><пробел><имя файла, под которым его надо сохранить>
пример:

http://example.com/archive.zip my_archive.zip
http://example.com/image.jpg picture.jpg
......
В HTTP ссылке нет пробелов, нет encoded символов и прочей ерунды - это всегда обычные ссылки с английскими символами без специальных символов в именах файлов и прочее. Ссылки без авторизации, не HTTPS/FTP - всегда только HTTP-протокол.

Ссылки могут повторяться в файле, но с разными именами для сохранения, например:

http://example.com/archive.zip first_archive.zip
http://example.com/archive.zip second_archive.zip

-n 5 -l 10m -f Download/download.txt -o Download/
