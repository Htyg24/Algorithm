string path = "D:\\GB";
string[] files = Directory.GetDirectories(path);
for (int i = 0; i < files.Length; i++)
{
    files[i] = files[i].Substring(path.Length + 1);
}
Console.WriteLine(String.Join('\n', files));
