import java.util.Objects;

public class day2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print(getCode());
        }
    }

    private static String getCode() {
        int index = 5;
        String result = "";
        String[] hints1 = getHint().split("\n");

        for (String i : hints1) {
            for (char c : i.toCharArray()){
                if (c == 'U') {
                    if (index > 3) {
                        index -= 3;
                    }
                }
                if (c == 'D') {
                    if (index < 7) {
                        index += 3;
                    }
                }
                if (c == 'R') {
                    if (index != 3 && index != 6 && index != 9) {
                        index += 1;
                    }
                }
                if (c == 'L') {
                    if (index != 1 && index != 4 && index != 7) {
                        index -= 1;
                    }
                }
                System.out.println(index);
            }
            result += index;
        }
        return result;
    }

    private static String getHint() {
        return "LUULRUULULLUDUDULDLUDDDLRURUDLRRDRDULRDDULLLRULLLURDDLRDLUUDDRURDDRDDDDRDULULLLLURDDLLRLUUDDDRLRRRDURLDDLRRLDUDRRRDLDLRRDLDLUURRLRULLULRUDRDLRUURLDRDLRLDULLLUDRDDRLURLUUDRLLLDRUUULLUULRUDDUDRDUURRRUDRLDDUURDUURUDRDDLULDDUDUDRRDDULUDULRDRULRLRLURURDULRUULLRDDDDRRUUDDDUUDRLLRUDRLRDLRRLULRLULRUDDULRLLLURLDDRLDDLRRLDRDDDRRLRUDRULUUDUURLDLRRULUDRDULDLLRRURRDDLRRRLULUDUUDDUDDLRDLRDRLRLDUDUDDUDLURRUURDRLRURLURRRLRLRRUDDUDDLUDRLUURUUDUUDDULRRLUUUDRLRLLUR\n" +
                "LDLLRRLDULDDRDDLULRRRDDUDUDRRLLRUUULRUDLLRRDDRRLDDURUUDLUDRRLDURDDRUDLUDUUDLDLLLDLLLDRLLDLRUULULLUUDULDUUULDDLRUDLLUDLUUULDRLUDRULUUDLDURDLDUULLRDUDRDLURULDLUUUDURLDDRLLDRLRDDDUDRUULLDLUDRRDDLDLUURUDDLDRURRLULUDDURLDRDRDUDDRRULRLDURULULRURDUURRUDRDDRDRLDRDUUDLRULRDDDULRURUDRUUULUUDDLRRDDDUDRLRUDRDLRRUDLUDRULDDUDLRLDDLDRLRDLULRDRULRLLRLUDUURULLLDDUULUUDDDUDRRULDDDULRUDRRLRLLLUDLULDUUULDDULDUUDLUULRDLDUDRUDLLDLDLLULDDDDLUDDUDRUDLRRRDDDDDLLRRDRUUDDDRRULRUDUUDRULLDLLLDDRDDUURLUUURUDRUDURLRUUUULUUURDRRRULDUULDLDDDRDDDDLLDRUDRDURLDDURDURULDDRLLRRLDUDRDURRLDRDLLULUUUD\n" +
                "LDDLRLRDDRLRUDDRDDUDRULUUULULDULRUULLRRDUULRDUUDDDRRULDDUDRLLLDULURDLDDRLLRURULULDLDULRDLDLRULUDLLDRUDLDURRDULDDRLRURDLLUDRDDDUDLUDULURULRDRLRULDLLRLDRRUDRDRUDRLDLRLUUURURRRLDDULLULLLRLRLULDLLRLDDRLDULURULRUURRUUURRUDRLRRURURDDDRULDULDLDLRRRLLDDRRURRULULULDRDULDRRULDUDRRLDULDRDURRDULLRRRLLLLRRLLRRRDRURDUULLURURURDDRRDRLLLULRRRDRLDRLDRDLLRUUDURRDRRDLLUDLDRLRLDLUDRDULRULRRLLRDLULDRLUDUUULLDRULDDLLRDUUUDRUUUUULUURDDLLDUURURRURLLURRDDUDUDRUUDDRDDRRLRLULRLRRRDRLLRRLLLDUULLUUDDLULLLDURRLLDRLDRDRLRRLRRULRRRRLRRRRRURUDULUULRDLLDRLRRDUURDRRUDRURRRDDRLDDLRLUDRDRDRRLDDDRDDRRRDUDULRURRDRDLLDRUD\n" +
                "UUUDLDDLRDLLLLRUUURDDLLURRUUURLUULLURUUDUDLDULULLRRRRLLLRDLLUDRUURDRURUDRURRLRLDRURLUDRLULRRURDDDURLLDULDLRRRDUUDDDRDLRUURRDRDRLRDLULRLDDRULRULDRDUDRUURLDLUDDULLLRURRLURLULDRRLUUURURLDLDDULLLRUUURDDDUURULULLUUUDUDRLLRRULUULDDDLLUDLURLLLRRULLURDRLUUDDLLDLLLUDULLRDRRRURDRUDUDUULUDURDLRUDLLRDDRURUDURLRULURDDURULLRDDRLRRDRLLULRDDDULRDLRULDDLRRDULDLUURRURUULRRDUURUDRRRRRLDULDLRURRULULDLRDDDRLLDURRULDUDUDRRRLUULRLUDURRRLRLDURRRRUULDRLUDDDUDURLURUDLLUDRDDDRLLURLRLDDURUUDDDUDUR\n" +
                "RURRRRURUDDRLURUDULRDUDDDUURULDRRRRURDLDRRLLDLUDLRRLRRUULLURULLRDLLRDDDDULLRLLDDLLRUDDULDUDLDURLRUULDDURURDURDLDRRULRURRRRRLRRLLUDURRURULRLRDLRLRRRLLURURDLLLDLDDULDLUDDLLLRUDDRDRLRUDRRLDDLRDLRLRLRLRRDUUURRUDRRLDLRRUULULLUDRRRUDLURDRUULDRDRRLUULULDDLURRLDULLURLDRLDULDRLLDLUUULLULRRDDRURRURLDLDRRLLLLLUDUURUULURLRDDDLRRRRLLLURUDLDDRDDRRUDURUULDRRULLLRRLRULLLRLDDLLRRLRURLRDRUDULLDDLDDDDDLDURURDLULRDDLRDLLRURLLRDLRUDDRDRRDURDURLUDRLDUDDDRRURRLUULURULLRLRDLRRLRURULLDDURLLRRRUDDRDLULURRRUUUULUULRRLLDLRUUURLLURLUURRLRL";
    }
}
